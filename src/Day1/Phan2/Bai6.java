package Day1.Phan2;

import java.util.Scanner;

public class Bai6 {
  
  public static int sumEven(int number) {
    int sum = 0;
    for(int i = 0; i < number; i++) {
      if(i % 2 == 0) {
        sum += i;
      }
    }
    return sum;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap vao so nguyen: ");
    int number = sc.nextInt();

    System.out.println("Tong cac so chan trong khoang tu 0 - " + number + " : " + sumEven(number));

    sc.close();
  }

}
