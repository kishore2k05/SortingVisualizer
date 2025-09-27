import java.util.Arrays;
import java.util.List;

public class insertionsort {

    public static void sort(int[] arr, List<int[]> steps) {
        int n = arr.length;

        steps.add(Arrays.copyOf(arr, n));

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
            
            steps.add(Arrays.copyOf(arr, n));
        }
    }
    
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1};
        System.out.println(Arrays.toString(data));
    }
}