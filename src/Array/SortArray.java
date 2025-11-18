package Array;

//arr = [1,0,1,0,0,0]

//Given above array, sort the array

public class SortArray {
    public static void sortArray(int[] nums){

        int right = nums.length-1;
        //int left = 0;
        for (int left = nums.length -1; left >= 0; left--) {
            if (nums[left] != 0){
                int temp =nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,0,0};
        sortArray(nums);
        for(int n : nums)
            System.out.print(n +" ");
    }


}


//[1,2,-2,4,0] target = 2


