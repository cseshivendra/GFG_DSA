// Find the Factorial of a number
public class Factorial {
    int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(); // Create an instance of the Factorial class
        int n = 5; // The number for which we want to find the factorial
        int result = factorial.fact(n); // Call the fact method
        System.out.println("Factorial of " + n + " is: " + result); // Print the result
    }
}