package NguyenThanhNhan.Question2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Bai2b {
    public static void main(String[] args) {
        String[] words = {"Hello", "Viet Nam", "Viet Nam", "Hello", "Viet Nam", "Hello!!!"};

        Map<String, Integer> wordFrequencyMap = Arrays.stream(words)
                .map(word -> word.replaceAll("\\p{Punct}", "")) 
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

        System.out.println("The frequency of occurrence of characters in array: ");
        wordFrequencyMap.forEach((word, frequency) ->
                System.out.println("Word \"" + word + "\" occurance " + frequency + " times."));
    }
}
