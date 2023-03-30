package Day1.Phan1;

import java.util.Scanner;

/**
 * Bai1
 */
public class Bai1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap vao so bat ky: ");
    int number = sc.nextInt();

    if(number >= 0) {
      System.out.println("Day la so nguyen duong");
    } else {
      System.out.println("Day la so nguyen am");
    }

    sc.close();

  }
  
}