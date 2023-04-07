package Day3.Chuong02_Stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

public class Ex4 {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Supplier<Stream<Integer>> supStream = () -> Stream.of(1, 2, 3, 4, 5);
        // Display the original stream list
        System.out.println("Original stream list: ");
        System.out.println(supStream.get().collect(Collectors.toList()));
//        stream.forEach(System.out::println);
//        List<Integer> ar = supStream.get().toList();
        List<Integer> arrayList = supStream.get().collect(Collectors.toCollection(ArrayList::new));
        // Convert the stream to an ArrayList
        // Display the converted ArrayList
        System.out.println("ArrayList after convert: ");
        System.out.println(arrayList);
//        System.out.println(ar);
        
//        
//        Stream<String> stringStream = Stream.of("A", "B", "C", "D");
//        Optional<String> result1 = stringStream.findAny(); 
//        System.out.println(result1.get()); 
//        Optional<String> result2 = stringStream.findFirst();
    }
}
