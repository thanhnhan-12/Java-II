package Day1.Phan2;

import java.util.Scanner;

public class Bai7 {

  public static void multiplyTable(int number) {
    for (int i = 1; i <= 20; i++) {
      int result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap vao so nguyen: ");
    int number = sc.nextInt();

    multiplyTable(number);

    sc.close();
  }

}
