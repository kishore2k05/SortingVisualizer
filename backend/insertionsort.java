import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5};
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int j = i - 1;
            
            while (j >= 0 && cur < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = cur;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}