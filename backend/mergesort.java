import java.util.Arrays;

public class mergesort {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int middle = array.length / 2;
            
            int[] left = Arrays.copyOfRange(array, 0, middle);
            int[] right = Arrays.copyOfRange(array, middle, array.length);
            
            mergeSort(left);
            mergeSort(right);
            
            int lp = 0;
            int rp = 0;
            int fp = 0;

            while (lp < left.length && rp < right.length) {
                if (left[lp] < right[rp]) {
                    array[fp] = left[lp];
                    lp++;
                } else {
                    array[fp] = right[rp];
                    rp++;
                }
                fp++;
            }

            while (lp < left.length) {
                array[fp] = left[lp];
                lp++;
                fp++;
            }

            while (rp < right.length) {
                array[fp] = right[rp];
                rp++;
                fp++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 6, 5};
        
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}