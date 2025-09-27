import java.util.Arrays;
import java.util.List;

public class bubblesort {

    public static void sort(int[] arr, List<int[]> steps) {
        int n = arr.length;
        
        steps.add(Arrays.copyOf(arr, n));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    steps.add(Arrays.copyOf(arr, n));
                }
            }
        }
        
        if (steps.isEmpty() || !Arrays.equals(steps.get(steps.size() - 1), arr)) {
             steps.add(Arrays.copyOf(arr, n));
        }
    }
    
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1};
        System.out.println(Arrays.toString(data));
    }
}