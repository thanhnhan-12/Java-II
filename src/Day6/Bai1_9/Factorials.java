package Day6.Bai1_9;

/**
 * Factorials
 */
public class Factorials {
    // 1. Variables
    private int[] factorials;

    // 2. Constructor
    public Factorials() {
        this.factorials = new int[10];
        this.computeFactorials();
    }
    
    // 3. Getter and Setter
    public int[] getFactorials() {
        return factorials;
    }

    public void setFactorials(int[] factorials) {
        this.factorials = factorials;
    }

    // 4. Methods
    public void computeFactorials() {
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
            this.factorials[i - 1] = fact;
        }
    }

    public void printReverseOrder() {
        for (int i = this.factorials.length - 1; i >= 0; i--) {
            System.out.println(this.factorials[i]);
        }
    }

    public static void main(String[] args) {
        Factorials obj = new Factorials();
        obj.printReverseOrder();
    }

}