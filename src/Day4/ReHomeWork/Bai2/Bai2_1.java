package Day4.ReHomeWork.Bai2;

public class Bai2_1 {
  
  public synchronized void show() {
    for(int i = 1; i <= 10; i++) {
      System.out.println(i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
