import java.util.Scanner;

public class Count_Char {
    int countCharacters(String str) {
        int count = 0; // Initialize count to 0
        // Iterate through the string until we reach the end
        for (int i = 0; i < str.toCharArray().length; i++) {
            count++; // Increment the count for each character
        }
        return count; // Return the total count of characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a string: "); // Prompt the user for input
        String userInput = scanner.nextLine(); // Read the string input from the user

        Count_Char cc = new Count_Char(); // Create an instance of Count_Char
        int charCount = cc.countCharacters(userInput); // Count the characters in the input
        System.out.println("The number of characters in the string is: " + charCount); // Output the result

        scanner.close(); // Close the scanner
    }
}