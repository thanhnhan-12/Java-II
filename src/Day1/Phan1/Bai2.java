package Day1.Phan1;

import java.util.Scanner;

public class Bai2 {
  public static String convertNumberToWord(int number) {
    String[] units = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
    String[] tens = { "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
        "chín mươi" };
    String[] hundreds = { "không trăm", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm",
        "bảy trăm", "tám trăm", "chín trăm" };

    String result = "";

    int unit = number % 10;
    int ten = (number / 10) % 10;
    int hundred = (number / 100) % 10;

    if (number == 0) {
      result = units[0];
    } else if (number < 10) {
      result = units[unit];
    } else if (number < 20) {
      result = tens[unit - 1];
    } else if (number < 100) {
      result = tens[ten - 1] + " " + units[unit];
    } else if (number < 1000) {
      result = hundreds[hundred] + " " + tens[ten - 1] + " " + units[unit];
    } else {
      result = "Số này không nằm trong phạm vi đề bài yêu cầu!";
    }

    return result;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao mot so nguyen bat ky: ");
    int number = scanner.nextInt();

    System.out.println("So " + number + " viet bang chu la: " + convertNumberToWord(number));

    scanner.close();
  }

}
