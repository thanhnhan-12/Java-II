package Day3.Chuong02_Stream;

import java.util.*;
import java.util.stream.*;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(5,13,4,21,13,27,2,59,59,34);
        Stream<Integer> stream = items.stream();
        Map<Integer, Long> counts = stream.collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
        Set<Map.Entry<Integer, Long>> entries = counts.entrySet();
        Stream<Map.Entry<Integer, Long>> stream2 = entries.stream();
        List<Map.Entry<Integer, Long>> list = stream2.filter(entry -> entry.getValue() > 1)
                                                     .collect(Collectors.toList());
        List<Integer> duplicates = list.stream()
                                      .map(Map.Entry::getKey)
                                      .collect(Collectors.toList());

        System.out.println("The list of duplicate elements is: " + duplicates);
    }
}

/* CACH 2
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "orange", "pear", "banana", "kiwi");
        
        List<String> duplicates = items.stream()
                .collect(Collectors.groupingBy(item -> item))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("The list of duplicate elements is: " + duplicates);
    }
}

*/