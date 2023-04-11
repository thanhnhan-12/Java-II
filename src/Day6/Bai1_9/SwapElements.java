package Day6.Bai1_9;

import java.util.Scanner;

public class SwapElements {
    // 1. Variable
    private int number;

    // 2. Constructor
    public SwapElements() {

    }

    public SwapElements(int number) {
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
    public void SwapElementArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println("Mang sau khi hoan doi: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SwapElements obj = new SwapElements();

        System.out.print("Nhap so luong phan tu cua mang: ");
        int number = sc.nextInt();

        int[] arr = new int[number];

        // Input array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr" + "[" + i + "]" + " = ");
            arr[i] = sc.nextInt();
        }

        // Output array
        System.out.println("Mang sau khi nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
        }

        obj.SwapElementArray(arr);

        sc.close();

    }

}
