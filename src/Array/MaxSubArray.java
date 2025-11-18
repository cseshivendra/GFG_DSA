package Array;

public class MaxSubArray {

    public int maxsub(int[] nums){
        int currentSum = nums[0];
        int maxsofar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxsofar = Math.max(maxsofar, currentSum);
        }

        return maxsofar;
    }

    public static void main(String[] args) {
        MaxSubArray obj = new MaxSubArray();
        int[] arr = { -2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(obj.maxsub(arr)); // 6
    }
}
