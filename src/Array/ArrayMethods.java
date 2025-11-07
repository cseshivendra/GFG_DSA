package Array;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] arr = {10,12,35,24,56};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int key = 12;
        int index = Arrays.binarySearch(arr,key);

        System.out.println(key+" Found at index :"+ index);


    }
}
