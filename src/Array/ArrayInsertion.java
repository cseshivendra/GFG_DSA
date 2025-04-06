package Array;

public class ArrayInsertion {
    public static void insertAtEnd(int[] arr, int sizeOfArray, int currentSize, int element) {
        // Check if there is space to insert the new element
        if (currentSize < sizeOfArray) {
            arr[currentSize] = element; // Insert the element at the end of the current elements
        } else {
            System.out.println("Array is full. Cannot insert element: " + element);
        }
    }

    public static void main(String[] args) {
        // Example usage
        int sizeOfArray = 6;
        int[] arr = {1, 2, 3, 4, 5}; // Initial elements
        int currentSize = 5; // Current number of elements in the array
        int element = 90;

        insertAtEnd(arr, sizeOfArray, currentSize, element);
        currentSize++; // Increment the current size after insertion

        // Print the modified array
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
        // Output: 1 2 3 4 5 90
    }
}