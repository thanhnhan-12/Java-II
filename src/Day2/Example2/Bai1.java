package Day2.Example2;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {
  public static void main(String[] args) {
    // Bai 1
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    hash_map.put(1, " Red");
    hash_map.put(2, " Green");
    hash_map.put(3, " Blue");
    hash_map.put(4, " Pink");
    hash_map.put(5, " Orange");

    System.out.println(hash_map );
    System.out.print("{");
    for (Map.Entry<Integer, String> e : hash_map.entrySet() ) {
      System.out.print(e.getKey() + "=" + e.getValue() + ", " );
    }
    System.out.println("}");

    // Bai 2
    System.out.println("Number of <key:value> is " + hash_map.size());

    // Bai 3
    HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
    hash_map1.put(1, " Red");
    hash_map1.put(2, " Green");
    hash_map1.put(3, " Blue");
    hash_map1.put(4, " Pink");
    hash_map1.put(5, " Orange");

    System.out.println("Hash Map 1: " + hash_map1);

  }
}
