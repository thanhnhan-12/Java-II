package Day6.Bai9_11;

import java.util.Scanner;

public class MultiplyTwoArrays {
     // 1. Variables
     private int[] arr1;
     private int[] arr2;
     private int[] result;

     // 2. Constructor
     public MultiplyTwoArrays() {

     }

     public MultiplyTwoArrays(int[] arr1, int[] arr2) {
          this.arr1 = arr1;
          this.arr2 = arr2;
          this.result = new int[arr1.length];
     }

     // 3. Getter and Setter
     public int[] getArr1() {
          return arr1;
     }

     public void setArr1(int[] arr1) {
          this.arr1 = arr1;
     }

     public int[] getArr2() {
          return arr2;
     }

     public void setArr2(int[] arr2) {
          this.arr2 = arr2;
     }

     public int[] getResult() {
          return result;
     }

     public void setResult(int[] result) {
          this.result = result;
     }

     // 4. Method
     public void multiplyArrays() {
          for (int i = 0; i < arr1.length; i++) {
               result[i] = arr1[i] * arr2[i];
          }
     }

     public void printResult() {
          for (int i = 0; i < result.length; i++) {
               System.out.print("Multiply elements of array: " + result[i] + " ");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          
          System.out.print("Nhap so luong phan tu cua mang: ");
          int number = sc.nextInt();
          
          int[] arr1 = new int[number];
          int[] arr2 = new int[number];
          MultiplyTwoArrays obj = new MultiplyTwoArrays(arr1, arr2);

          // Input array 1
          System.out.println("Array 1: ");
          for (int i = 0; i < arr1.length; i++) {
               System.out.print("arr1" + "[" + i + "]" + " = ");
               arr1[i] = sc.nextInt();
          }

          // Output array 2
          System.out.println("Mang 1 sau khi nhap: ");
          for (int i = 0; i < arr1.length; i++) {
               System.out.println("arr" + "[" + i + "]" + " = " + arr1[i]);
          }

          // Input array 2
          System.out.println("Array 2: ");
          for (int i = 0; i < arr2.length; i++) {
               System.out.print("arr2" + "[" + i + "]" + " = ");
               arr2[i] = sc.nextInt();
          }

          // Output array 2
          System.out.println("Mang 2 sau khi nhap: ");
          for (int i = 0; i < arr2.length; i++) {
               System.out.println("arr" + "[" + i + "]" + " = " + arr2[i]);
          }

          obj.multiplyArrays();
          obj.printResult();

          sc.close();
     }

}
