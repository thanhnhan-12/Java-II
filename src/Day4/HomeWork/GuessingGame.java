package Day4.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame extends Thread {
  // 1. Variable
  private String threadName;
  private int targetNumber;

  // 2. Constructor
  public GuessingGame(String threadName, int targetNumber) {
    this.targetNumber = targetNumber;
    this.threadName = threadName;
  }

  // 3. Method
  public void run() {
    int guessNumber;
    int count = 0;
    Random random = new Random();
    do {
      guessNumber = random.nextInt(100) + 1;
      System.out.println(threadName + " guess number " + guessNumber);
      count++;
    } while(guessNumber != targetNumber);
    System.out.println(threadName + " guessed the number " + targetNumber + " in " + count + " guess times " );
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int targetNumber;
    do {
      System.out.print("Enter a number from 1 to 100: ");
      targetNumber = sc.nextInt();
      
    } while (targetNumber >= 100);

    GuessingGame guessNumer1 = new GuessingGame("Thread 1", targetNumber);
    GuessingGame guessNumer2 = new GuessingGame("Thread 1", targetNumber);

    guessNumer1.start();
    guessNumer2.start();

    sc.close();

  }

}
