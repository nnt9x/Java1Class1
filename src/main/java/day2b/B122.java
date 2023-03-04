package day2b;

import java.util.Random;
import java.util.Scanner;

public class B122 {
    public static void main(String[] args) {
        // Input: double[]
        // Output: max

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = in.nextInt();
        in.close();

        Random random = new Random();
        // Tao mang rong
        double[] arr = new double[n];
        // Gan gia tri cho mang
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextFloat();
        }
        // In ra mang
        System.out.print("Array: ");
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println();

        // In ra gia tri max
        System.out.println("Max = " + max);
    }
}
