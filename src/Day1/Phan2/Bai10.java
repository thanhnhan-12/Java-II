package Day1.Phan2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai10 {
  public static void main(String[] args) {
    // Pattern for id
    Pattern pid = Pattern.compile("B170[1-9]");

    // Input ID
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("Please input your ID: ");
      String id = sc.nextLine();
  
      // Matcher
      if(pid.matcher(id).find() ) {
        System.out.println("Student ID is OK");
        break;
      }
      else {
        System.out.println("Studetn ID is not OK");
      }

    }

    sc.close();
  }
}
