package Day6.Bai1_9;

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
    public void findSmallestNumber() {
        if(number1 < number2 && number1 < number3 ) {

        }
    }

}
