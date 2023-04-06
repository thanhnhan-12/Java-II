package Day4.Chuong04_Thread;

public class Example1 implements Runnable {
  public void run() {
    System.out.println("Thread is running ...");
  }

  // Tạo một "Thread" bằng cách implements Runnable interface
  // Bước 1  : Tạo một lớp kế thừa

  public static void main(String[] args) {
    Example1 obj1 = new Example1();
    Thread obj2 = new Thread(obj1);
    obj2.start();
  }
}
