package Array;

import java.util.HashMap;
import java.util.Map; // Import the Map interface

public class FrequencyCount {

    static void printfreq(int arr[]) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 10, 20, 30, 30, 30, 10};
        printfreq(arr);
    }
}