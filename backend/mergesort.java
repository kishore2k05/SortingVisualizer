import java.util.Arrays;
import java.util.List;

public class mergesort {

    public static void sort(int[] array, List<int[]> steps) {
        steps.add(Arrays.copyOf(array, array.length));
        mergeSortAndCapture(array, steps);
    }

    private static void mergeSortAndCapture(int[] array, List<int[]> steps) {
        if (array.length > 1) {
            int middle = array.length / 2;
            
            int[] left = Arrays.copyOfRange(array, 0, middle);
            int[] right = Arrays.copyOfRange(array, middle, array.length);
            
            mergeSortAndCapture(left, steps);
            mergeSortAndCapture(right, steps);
            
            merge(array, left, right, steps);
        }
    }

    private static void merge(int[] array, int[] left, int[] right, List<int[]> steps) {
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
        steps.add(Arrays.copyOf(array, array.length));
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 6, 5};
        List<int[]> steps = new java.util.ArrayList<>();
        System.out.println(Arrays.toString(array));
        sort(array, steps);
        for (int[] step : steps) {
            System.out.println(Arrays.toString(step));
        }
    }
}