import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5};
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}