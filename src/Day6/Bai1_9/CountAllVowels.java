package Day6.Bai1_9;

import java.util.Scanner;

public class CountAllVowels {
    // 1. Variable
    private String inputString;

    // 2. Constructor
    public CountAllVowels() {

    }

    public CountAllVowels(String inputString) {
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
    public int countVowels(String inputString) {
        int countVowel = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char check = Character.toLowerCase(inputString.charAt(i));
            if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                countVowel++;
            }
        }

        return countVowel;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountAllVowels obj = new CountAllVowels();

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("All vowels in a string: " + obj.countVowels(inputString) );


        sc.close();

    }
    

}
