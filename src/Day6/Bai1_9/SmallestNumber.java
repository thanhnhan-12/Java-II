package Day6.Bai1_9;

import java.util.Scanner;

public class SmallestNumber {
    // 1. Variable
    private int number1;
    private int number2;
    private int number3;

    // 2. Constuctor
    public SmallestNumber() {}

    public SmallestNumber(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // 3. Getter and Setter
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    // 4. Methods
    public void findSmallestNumber(int number1, int number2, int number3) {
        if(number1 <= number2 && number1 <= number3 ) {
            System.out.println(number1 + " is smallest number " );
        } else 

        if(number2 <= number1 && number2 <= number3 ) {
            System.out.println(number2 + " is smallest number " );
        }

        if(number3 <= number1 && number3 <= number2 ) {
            System.out.println(number3 + " is smallest number " );
        }

        // if(number1 == number2 && number1 == number3 ) {
        //     System.out.println("Not have the smallest number " );
        // }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmallestNumber obj = new SmallestNumber();

        System.out.print("Enter the number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int number3 = sc.nextInt();

        obj.findSmallestNumber(number1, number2, number3);

        sc.close();

    }

}
