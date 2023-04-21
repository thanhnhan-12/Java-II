package NguyenThanhNhan.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2a {
    public static void main(String[] args) {
        System.out.println("Enter the string to count the frequency of occurrence of characters: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        input.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> characterFrequencyMap.put(c, characterFrequencyMap.getOrDefault(c, 0) + 1));

        System.out.println("The frequency of occurrence of characters: ");
        characterFrequencyMap.forEach((character, frequency) ->
                System.out.println("Character '" + character + "' occurance " + frequency + " times."));
    }
    
}
