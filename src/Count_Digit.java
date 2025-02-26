import java.util.Scanner;

public class Count_Digit {
    // Method to count the number of digits in an integer
    int countDigits(int x) {
        int count = 0;
        // Handle the case when x is 0
        if (x == 0) {
            return 1;
        }
        // Count the digits
        while (x > 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int userInput = scanner.nextInt();

        // Create an instance of Count_Digit to call the countDigits method
        Count_Digit cd = new Count_Digit();
        int digitCount = cd.countDigits(userInput);
        System.out.println("The Number of digits in " + userInput + " is: " + digitCount);

        scanner.close();
    }
}