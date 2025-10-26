package Array;

public class TrappingRainWater {

    // Function to calculate the amount of water that can be trapped
    static int getWater(int arr[], int n) {
        int res = 0; // Variable to store the total amount of trapped water

        // Arrays to store the maximum height to the left and right of each bar
        int lMax[] = new int[n];
        int rMax[] = new int[n];

        // Fill the left maximum array
        lMax[0] = arr[0]; // The first element's left max is itself
        for(int i = 1; i < n; i++) {
            // For each bar, the left max is the maximum of the current bar height and the left max of the previous bar
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }

        // Fill the right maximum array
        rMax[n - 1] = arr[n - 1]; // The last element's right max is itself
        for(int i = n - 2; i >= 0; i--) {
            // For each bar, the right max is the maximum of the current bar height and the right max of the next bar
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }

        // Calculate the total trapped water
        for(int i = 1; i < n - 1; i++) { // We skip the first and last bars
            // The water trapped on top of the current bar is determined by the shorter of the two max heights minus the height of the bar itself
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }

        return res; // Return the total amount of trapped water
    }

    public static void main(String args[]) {
        // Example input array representing the heights of the bars
        int arr[] = {5, 0, 6, 2, 3}, n = 5; // n is the number of bars
        // Call the getWater function and print the result
        System.out.println(getWater(arr, n));// Output the total trapped water
    }
}
