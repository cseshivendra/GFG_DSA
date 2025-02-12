public class TrailingZero {
    int countZero(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        TrailingZero trailingZero = new TrailingZero();
        int n = 5;
        int result = trailingZero.countZero(n);
        System.out.println("The trailing zero in " + n + " is: " + result);


    }
}
