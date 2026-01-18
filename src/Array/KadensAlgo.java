package Array;

public class KadensAlgo {

    public int maxSubArray(int[] a) {

        int maxSum = a[0];
        int sum = a[0];

        for (int i = 1; i < a.length; i++) {

            if (sum >= 0) {
                sum = sum + a[i];
            } else {
                sum = a[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    // Main Method
    public static void main(String[] args) {

        KadensAlgo obj = new KadensAlgo();

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(arr);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
