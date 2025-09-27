import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class simplesortserver {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        server.createContext("/sort", new SortHandler());
        
        server.setExecutor(null); 
        server.start();
        System.out.println("Java Server started on port 8000.");
    }

    static class SortHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            
            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "POST");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type"); 
            
            if (exchange.getRequestMethod().equalsIgnoreCase("OPTIONS")) {
                exchange.sendResponseHeaders(204, -1);
                return;
            }
            
            String path = exchange.getRequestURI().getPath();
            String[] parts = path.split("/");
            String algorithm = parts[parts.length - 1]; 

            // Initialize the list to collect all array states (steps)
            List<int[]> sortSteps = new ArrayList<>();
            int[] inputArray = {50, 10, 90, 30, 70}; 
            int[] dataToSort = Arrays.copyOf(inputArray, inputArray.length);
            
            switch (algorithm) {
                case "bubble":
                    bubblesort.sort(dataToSort, sortSteps);
                    break;
                case "insertion":
                    insertionsort.sort(dataToSort, sortSteps);
                    break;
                case "merge":
                    mergesort.sort(dataToSort, sortSteps);
                    break;
                case "quick":
                    quicksort.sort(dataToSort, sortSteps);
                    break;
                case "selection":
                    selectionsort.sort(dataToSort, sortSteps);
                    break;
                default:
                    String errorResponse = "Error: Unknown algorithm '" + algorithm + "'. Only supported algorithms can be visualized.";
                    exchange.sendResponseHeaders(400, errorResponse.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(errorResponse.getBytes());
                    os.close();
                    return;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int[] step : sortSteps) {
                sb.append(Arrays.toString(step)).append("|");
            }
            String response = sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "[]";

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}