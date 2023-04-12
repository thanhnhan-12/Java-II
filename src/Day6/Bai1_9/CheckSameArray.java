package Day6.Bai1_9;

import java.util.Scanner;

public class CheckSameArray {
    // 1. Variable
    private int number;

    // 2. Constructor
    public CheckSameArray() {

    }

    public CheckSameArray(int number) {
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
    public void CheckArray(int[] arr) {
        if (arr[0] == arr[arr.length - 1]) {
            System.out
                    .println("Phan tu dau " + arr[0] + " va " + "phan tu cuoi " + arr[arr.length - 1] + " giong nhau ");
        } else {
            System.out.println(
                    "Phan tu dau " + arr[0] + " va " + "phan tu cuoi " + arr[arr.length - 1] + " khong giong nhau ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckSameArray obj = new CheckSameArray();

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

        obj.CheckArray(arr);

        sc.close();
    }

}
