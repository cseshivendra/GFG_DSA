package Array;

public class ArrayInsertion {
    public static void insertAtEnd(int[] arr, int sizeOfArray, int element) {
        // Insert the element at the end of the array
        arr[sizeOfArray - 1] = element;
    }

    public static void main(String[] args) {
        // Example usage
        int sizeOfArray = 6;
        int[] arr = {1, 2, 3, 4, 5, 0}; // The last element is a placeholder
        int element = 90;

        insertAtEnd(arr, sizeOfArray, element);

        // Print the modified array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i] + " ");
        }
        // Output: 1 2 3 4 5 90
    }
}