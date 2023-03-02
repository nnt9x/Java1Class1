package day1b;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Input: so nguyen N
        // Output: N la chan hay le
        // n % 2 == 0 -> chẵn
        // n % 2 != 0 -> lẻ
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn");
        }
        if (n % 2 != 0) {
            System.out.println(n + " là số lẻ");
        }
    }
}
