package Day4.ReHomeWork;

public class Bai1 extends Thread {
  @Override
  public void run() {
    for(int i = 1; i <= 10; i++) {
      System.out.println(this.getName() + " - " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }  

  public static void main(String[] args) {
    // Create three threads
    Thread t1 = new Bai1();
    Thread t2 = new Bai1();
    Thread t3 = new Bai1(); 

    // set priority
    t1.setPriority(MAX_PRIORITY);
    t2.setPriority(NORM_PRIORITY);
    t3.setPriority(MIN_PRIORITY);

    // start thread
    t1.start();
    t2.start();
    t3.start();


  }

}
