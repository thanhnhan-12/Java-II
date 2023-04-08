package Day4.ReHomeWork.Bai2;

public class Bai2_2 extends Thread {
  // Variable
  private Bai2_1 obj;

  // Constructor
  public Bai2_2() {
  }

  public Bai2_2(Bai2_1 obj) {
    this.obj = obj;
  }

  // Getter and Setter
  public Bai2_1 getObj() {
    return obj;
  }

  public void setObj(Bai2_1 obj) {
    this.obj = obj;
  }

  // Method
  @Override
  public void run() {
    obj.show();
  }

  public static void main(String[] args) {
    Bai2_1 obj1 = new Bai2_1();

    Bai2_2 t1 = new Bai2_2(obj1);
    Bai2_2 t2 = new Bai2_2(obj1);
    Bai2_2 t3 = new Bai2_2(obj1);

    t1.start();
    t2.start();
    t3.start();


  }

 
  
}
