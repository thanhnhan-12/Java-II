package Day4.ReHomeWork;

import java.util.Scanner;

public class Bai4 extends Thread {
  // Variable
  private int luckyNmuber;
  private int count = 0;

  // Constructor
  public Bai4(int luckyNmuber) {
    this.luckyNmuber = luckyNmuber;
  }

  @Override
  public void run() {
    int guessNumber = 0;
    do {
      guessNumber = (int) (Math.random() * 100 + 1 );
      count++;
      System.out.println("No. : " + count + ". " + this.getName() + " guess " + guessNumber );
    } while (guessNumber != luckyNmuber);
    System.out.println("Finish! " + this.getName() + " guess " + luckyNmuber + " at " + count );
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter lucky number (1 - 100): ");
    int number = sc.nextInt() ;

    Thread t1 = new Bai4(number);
    Thread t2 = new Bai4(number);

    t1.start();
    t2.start();

    sc.close();
  }


}
