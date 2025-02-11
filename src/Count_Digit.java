import java.util.Scanner;
public class Count_Digit {
    int countDigits(int x){
        int count = 0;
        while (x > 0 ){
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number : ");
        int userInput = scanner.nextInt();
        Count_Digit cd = new Count_Digit();
        int digitCount = cd.countDigits(userInput);
        System.out.println("The Number of the digits in " +userInput+ " is : "+digitCount);
        scanner.close();

    }
}
