package Day4.HomeWork;

public class ThreadGetName {
  public static void main(String[] args) {
    Thread threadA = new Thread() {
      @Override
      public void run() {
        System.out.println("Thread A");
      }
    };

    Thread threadB = new Thread() {
      @Override
      public void run() {
        System.out.println("Thread B");
      }      
    };

    System.out.println("Thread names are following: ");
    System.out.println(threadA.getName());
    System.out.println(threadB.getName());

  }
}
