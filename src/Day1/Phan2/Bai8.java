package Day1.Phan2;

import java.util.Scanner;

public class Bai8 {
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;

    do {
      System.out.print("Nhap vao so nguyen (number < 1000): ");
      number = sc.nextInt();
    } while (number > 1000);


    System.out.println("Cac so nguyen to tu 0 - " + number + " : ");
    
    for (int i = 2; i <= number; i++) {
      if (isPrime(i)) {
          System.out.print(i + " ");
      }
    }

    sc.close();
  }
}
