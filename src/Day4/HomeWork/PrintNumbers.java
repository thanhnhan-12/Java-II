package Day4.HomeWork;

public class PrintNumbers implements Runnable {
  private String threadName;

  public PrintNumbers(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    for(int i = 1; i <= 10; i++) {
      System.out.println(threadName + ": " + i);

      try {
        Thread.sleep(100);        
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(new PrintNumbers("Thread 1"));
    t1.setPriority(Thread.MIN_PRIORITY);

    Thread t2 = new Thread(new PrintNumbers("Thread 2"));
    t2.setPriority(Thread.NORM_PRIORITY);

    Thread t3 = new Thread(new PrintNumbers("Thread 3"));
    t3.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();

  }

}
