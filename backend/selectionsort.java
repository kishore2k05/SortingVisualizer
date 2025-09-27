import java.util.Arrays;
import java.util.List;

public class selectionsort {

    public static void sort(int[] arr, List<int[]> steps) {
        int n = arr.length;
        
        steps.add(Arrays.copyOf(arr, n));

        for (int pos = 0; pos < n - 1; pos++) {
            int min = pos;
            
            for (int i = pos + 1; i < n; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            
            if (min != pos) {
                int temp = arr[pos];
                arr[pos] = arr[min];
                arr[min] = temp;
                
                steps.add(Arrays.copyOf(arr, n));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5}; 
        List<int[]> steps = new java.util.ArrayList<>();
        
        sort(arr, steps);
        
        System.out.println(Arrays.toString(arr));
        for (int[] step : steps) {
            System.out.println(Arrays.toString(step));
        }
    }
}