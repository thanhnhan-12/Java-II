package Day6.Bai12_19;

import java.util.Scanner;

public class FindMaximumMinimum {
    // 1. Variable
    private int[] arr;

    // 2. Constructor
    public FindMaximumMinimum() {

    }

    public FindMaximumMinimum(int[] arr) {
        this.arr = arr;
    }

    // 3. Getter and Setter
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    // 4. Method
    public int findMaximumValue() {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ) {
                max = arr[i];
            }
        }

        return max;
    }

    public int findMinimumValue() {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min ) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element: ");
        int number = sc.nextInt();

        int[] arr = new int[number]; 

        FindMaximumMinimum obj = new FindMaximumMinimum(arr);

        // Input Array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr" + "[" + i + "]" + " = " );
            arr[i] = sc.nextInt();
        }

        // Output Array
        System.out.println("After enter array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("Maximum: " + obj.findMaximumValue());
        System.out.println("Minimum: " + obj.findMinimumValue());

        sc.close();
    }

}
