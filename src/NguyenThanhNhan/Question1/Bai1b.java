package NguyenThanhNhan.Question1;

public class Bai1b {
    private static final int N = 10; 
    private static final int X = 5; 
    private static double f1Result = 0;
    private static int f2Result = 0;
    private static int f3Result = 0;

    static class F1Calculator implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= N; i++) {
                f1Result += 1.0 / i;
            }
        }
    }

    static class F2Calculator implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= N; i++) {
                f2Result += i * X;
            }
        }
    }

    static class F3Calculator implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= N; i++) {
                f3Result += i;
            }
        }
    }

    public static void main(String[] args) {
        Thread f1Thread = new Thread(new F1Calculator());
        Thread f2Thread = new Thread(new F2Calculator());
        Thread f3Thread = new Thread(new F3Calculator());

        f1Thread.start();
        f2Thread.start();
        f3Thread.start();

        try {
            f1Thread.join();
            f2Thread.join();
            f3Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double s = f1Result + f2Result + f3Result;

        System.out.println("S = F1(" + N + ") + F2(" + X + ", " + N + ") + F3(" + X + ", " + N + ")");

        System.out.println("S = " + f1Result + " + " + f2Result + " + " + f3Result);

        System.out.println("S = " + s);

    }

    
}
