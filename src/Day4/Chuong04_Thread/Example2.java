package Day4.Chuong04_Thread;

public class Example2 extends Thread {
  public void run() {
    System.out.println("Thread is running ...");
  }

  public static void main(String[] args) {
    Example2 obj1 = new Example2();
    Thread obj2 = new Thread(obj1);
    obj2.start();
  }

}
