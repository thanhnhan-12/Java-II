package Day2.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Bai1
 */
public class Bai1 {
  public static void main(String[] args) {

    ArrayList<String> colors = new ArrayList<String>();

    List<String> color = new ArrayList<String>();

    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Violet");
    System.out.println("Bai 1: Print");

    System.out.println("Colors: " + colors);

    for (String e : colors) {
      System.out.print(e + ", ");
    }

    // Bai 3
    System.out.println("\n_ Bai 3: Add Element");
    color.add("Black");
    color.add("Pink");
    color.add("Grey");
    color.add("Violet");

    color.add(0, "Orange");
    color.add(2, "Purple");
    // System.out.print("\n");
    System.out.print("Color: " + color);

    // Bai 4
    System.out.println("\n_ Bai 4: Get");
    String e = colors.get(3);
    System.out.println(""+ e);

    // Bai 5
    System.out.println("_ Bai 5: Set");
    color.set(3, "Brown");
    System.out.println("Color: " + color);

    // Bai 6
    System.out.println("_ Bai 6: Remove");
    colors.remove(3);
    System.out.println("Colors: "+ colors);

    // Bai 7
    System.out.println("_ Bai 7: Search");
    String[] search = {"Green", "Pink"};
    for (String f : search) {
      if(colors.contains(f)) 
        System.out.println(f + " is found in " + colors);
      else
        System.out.println(f + " is not found in " + colors);
    }

    // Bai 8
    System.out.println("_ Bai 8: Sort");
    System.out.println("List Before sort: " + color);
    Collections.sort(color);
    System.out.println("List After sort: " + color);

    // Bai 9
    System.out.println("_ Bai 9: Copy ");
    List<String> list1 = new ArrayList<String>();
		list1.add("R");
		list1.add("G");
		list1.add("P");
		list1.add("O");
		list1.add("Y");
		System.out.println("List  : "+ color);
		System.out.println("List 1: "+ list1);
		Collections.copy(color, list1);
		System.out.println();
		System.out.println("List  : " + color);
		System.out.println("List 1: " + list1);

		//Bai 10
    System.out.println("_ Bai 10: Shuffle");
		Collections.shuffle(list1);
		System.out.println("List 1: "+list1);

    // Bai 11
    System.out.println("_ Bai 11: Reverse");
    Collections.reverse(list1);
    System.out.println("List 1: " + list1);

    // Bai 12
    System.out.println("_ Bai 12: Sub List");
    System.out.println("List 1: " + color);
    System.out.println("Sub list: " + color.subList(1, 4));
    
    // Bai 13
    System.out.println("_ Bai 13: Compare");
    



  }
  
}