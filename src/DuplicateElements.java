import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        // Using HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert HashSet back to array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        // Sample array with duplicates
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 4};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the unique array
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}