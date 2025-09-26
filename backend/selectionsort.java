import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5}; 
        int n = arr.length;
        for (int pos = 0; pos < n - 1; pos++) {
            int min = pos;
            for (int i = pos + 1; i < n; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[min];
            arr[min] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}