package Day6.Bai1_9;

import java.util.Scanner;

public class SumDigits {
    // 1. Variable
    private int number;

    // 2. Constructor
    public SumDigits() {

    }

    public SumDigits(int number) {
        this.number = number;
    }

    // 3. Getter and Setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 4. Method
    public int computeSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SumDigits obj = new SumDigits();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Sum of the digits in an integer: " + obj.computeSumOfDigits(number));

        sc.close();
    }

}
