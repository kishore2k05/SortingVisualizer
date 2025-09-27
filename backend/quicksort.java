import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class quicksort {

    public static void sort(int[] array, List<int[]> steps) {
        steps.add(Arrays.copyOf(array, array.length));
        quicksortInPlace(array, 0, array.length - 1, steps);
    }
    
    private static void quicksortInPlace(int[] arr, int low, int high, List<int[]> steps) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high, steps);
            quicksortInPlace(arr, low, partitionIndex - 1, steps);
            quicksortInPlace(arr, partitionIndex + 1, high, steps);
        }
    }

    private static int partition(int[] arr, int low, int high, List<int[]> steps) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high); 
        steps.add(Arrays.copyOf(arr, arr.length));
        
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
                steps.add(Arrays.copyOf(arr, arr.length));
            }
        }
        swap(arr, i + 1, high);
        steps.add(Arrays.copyOf(arr, arr.length));
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 9, 6};
        List<int[]> steps = new java.util.ArrayList<>();

        System.out.println("Before: " + Arrays.toString(arr));
        
        sort(arr, steps);
        
        System.out.println("After: " + Arrays.toString(arr));
        for (int[] step : steps) {
            System.out.println(Arrays.toString(step));
        }
    }
}