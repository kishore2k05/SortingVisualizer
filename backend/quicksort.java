import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class quicksort {

    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        Random rand = new Random();
        Integer pivot = arr.get(rand.nextInt(arr.size()));

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();

        for (Integer i : arr) {
            if (i < pivot) {
                left.add(i);
            } else if (i > pivot) {
                right.add(i);
            } else {
                middle.add(i);
            }
        }

        ArrayList<Integer> sortedLeft = quicksort(left);
        ArrayList<Integer> sortedRight = quicksort(right);

        ArrayList<Integer> result = new ArrayList<>(sortedLeft);
        result.addAll(middle);
        result.addAll(sortedRight);
        
        return result;
    }

    public static void main(String[] args) {
        // Initialize the array as a list in Java
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 5, 7, 9, 6));

        System.out.println("Before: " + arr);
        
        ArrayList<Integer> sortedArr = quicksort(arr);
        
        System.out.println("After: " + sortedArr);
    }
}