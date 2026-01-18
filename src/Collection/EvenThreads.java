class EvenThread extends Thread {
    private int n;

    EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class EvenNumberUsingThread {
    public static void main(String[] args) {
        int n = 20;

        EvenThread t1 = new EvenThread(n);
        t1.start();
    }
}
