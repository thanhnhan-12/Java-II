package Day1.Phan1;

import java.util.Scanner;

public class Bai4 {
  public static void checkRightTriangle(int ab, int ac, int bc) {
    if (ab > 0 && ac > 0 && bc > 0 && ab + ac > bc || ab + bc > ac
        || ac + bc > ab) {
      if (ab == Math.sqrt(Math.pow(ac, 2) + Math.pow(bc, 2)) ||
          ac == Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2)) ||
          bc == Math.sqrt(Math.pow(ab, 2) + Math.pow(ac, 2))) {
        System.out.println("Day la tam giac vuong");
      } else {
        System.out.println("Day khong phai la tam giac vuong");
      }
      System.out.println("Day la tam giac");
    } else {
      System.out.println("Day khong phai la tam giac");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap canh thu nhat: ");
    int ab = sc.nextInt();
    System.out.print("Nhap canh thu hai: ");
    int ac = sc.nextInt();
    System.out.print("Nhap canh thu ba: ");
    int bc = sc.nextInt();

    checkRightTriangle(ab, ac, bc);

    sc.close();
  }
}
