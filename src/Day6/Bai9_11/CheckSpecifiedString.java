package Day6.Bai9_11;

import java.util.Scanner;

public class CheckSpecifiedString {
    // 1. Variable
    private String inputString;

    // 2. Constructor
    public CheckSpecifiedString() {

    }

    public CheckSpecifiedString(String inputString) {
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
    public boolean checkString(String word) {
        return inputString.startsWith(word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        CheckSpecifiedString check = new CheckSpecifiedString(inputString);

        System.out.println("Enter a word to check if the input string starts with it:");
        String word = sc.nextLine();

        if(check.checkString(word)) {
            System.out.println("The input string starts with the specified word.");
        } 
        else {
            System.out.println("The input string does not start with the specified word.");
        }

        sc.close();
    }

}
