package Day1.Phan3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai15 {
  /* 1. Variables */
  private String[] id = new String[5] ;

  /* 2. Constructor */ public Bai15() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println("Please input id " + (i + 1));
      this.id[i] = sc.nextLine();
    }

    sc.close();
  }

  /* 3. Method */
  public void testID() {
    Pattern pid = Pattern.compile("00y[2-5]L\\d{4}");
    int count = 0;
    for (String x : id) {
      if (!pid.matcher(x).find()) {
        System.out.println("Sai roi");
        break;
      }
      else {
        count++;
      }
    }
    if(count == 5) 
      System.out.println("Dung roi");
  }

  public static void main(String[] args) {
    Bai15 obj = new Bai15();
    obj.testID();
  }

}
