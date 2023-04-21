package NguyenThanhNhan.Question1;

public class Bai1a {
    private static Object lock = new Object(); 

    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 65; i <= 74; i++) {
                    System.out.print(i + " - ");
                    lock.notify();
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); 
            }
        }
    }

    static class CharPrinter implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 65; i <= 74; i++) {
                    System.out.print((char) i + ", ");
                    lock.notify();
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); 
            }
        }
    }

    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberPrinter());
        Thread charThread = new Thread(new CharPrinter());

        numberThread.start();
        
        charThread.start();
    }
    
}