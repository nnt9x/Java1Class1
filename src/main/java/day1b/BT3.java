package day1b;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Bước 1: Khai báo và nhập a, b
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("Enter a, b: ");
        a = in.nextDouble();
        b = in.nextDouble();
        in.close();

        // Bước 2: kiểm tra và kết luận về x
        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        } else if (b == 0) {
            System.out.println("PT có vô số nghiệm");
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
