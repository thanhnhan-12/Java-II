package Day4.HomeWork;

public class ThreeThreads implements Runnable {
  private int id;
  private static Object lock = new Object();

  public ThreeThreads(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      synchronized (lock) {
        System.out.println("Thread: " + id + ": " + i);
      }

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }    
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new ThreeThreads(1));
    Thread thread2 = new Thread(new ThreeThreads(2));
    Thread thread3 = new Thread(new ThreeThreads(3));

    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.NORM_PRIORITY);
    thread3.setPriority(Thread.MIN_PRIORITY);

    thread1.start();
    thread2.start();
    thread3.start();

  }

}
