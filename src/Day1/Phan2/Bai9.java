package Day1.Phan2;

import java.util.Scanner;

public class Bai9 {
  public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    int fib1 = 1;
    int fib2 = 1;
    int result = 0;

    for (int i = 2; i <= n; i++) {
      result = fib1 + fib2;
      fib1 = fib2;
      fib2 = result;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;

    do {
      System.out.print("Nhap so nguyen n (n <= 20): ");
      n = scanner.nextInt();
    } while (n > 20);

    int result = fibonacci(n);
    System.out.println("So Fibonacci ung voi n = " + n + " la: " + result);

    scanner.close();
  }

}
