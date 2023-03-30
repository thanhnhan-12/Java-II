package Day1.Phan1;

import java.util.Scanner;

public class Bai3 {
  public static void checkTriangle(float number1, float number2, float number3) {
    if (number1 > 0 && number2 > 0 && number3 > 0 && number1 + number2 > number3 || number1 + number3 > number2
        || number2 + number3 > number1) {

      System.out.println("Day la tam giac");
    } else {
      System.out.println("Day khong phai la tam giac");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so thu nhat: ");
    float number1 = sc.nextFloat();
    System.out.print("Nhap so thu nhat: ");
    float number2 = sc.nextFloat();
    System.out.print("Nhap so thu nhat: ");
    float number3 = sc.nextFloat();

    checkTriangle(number1, number2, number3);

    sc.close();

  }
}
