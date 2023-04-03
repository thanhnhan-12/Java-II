package Day2.Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
  
  public static void main(String[] args) {
    ArrayList<String> listElements = new ArrayList<String>();
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu: ");
    int number = sc.nextInt();

    sc.nextLine();
    for(int i = 0; i < number; i++) {
      System.out.print("arr" + "[" + i + "]" + " = ");
      String element = sc.nextLine();
      listElements.add(element);
    }

    System.out.println("Cac phan tu trong ArrayList: ");
    for (String element : listElements) {
      System.out.print(element + ", ");
    }
    System.out.print("\nList" + listElements);

    sc.close();

  }

}
