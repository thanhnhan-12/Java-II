package Day6.Bai1_9;

import java.util.Scanner;

public class CountAllWords {
    // 1. Variable
    private String inputString;

    // 2. Constructor
    public CountAllWords() {

    }

    public CountAllWords(String inputString) {
        this.inputString = inputString;
    }

    // 3. Getter and Setter
    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    // 4. Method
    public int countWords(String inputString) {
        int stringCount = 0;

        String[] words = inputString.split(" ");
        
        stringCount = words.length;

        return stringCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountAllWords obj = new CountAllWords();

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("All words in a string: " + obj.countWords(inputString) );


        sc.close();

    }

}
