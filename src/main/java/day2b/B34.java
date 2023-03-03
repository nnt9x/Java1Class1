package day2b;

import java.util.Scanner;

public class B34 {
    public static void main(String[] args) {
        // Bước 1: Nhập n
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        // Bước 2: Kiểm tra n
        if (n < 1) {
            System.out.println("Không hợp lệ!");
            System.exit(0);
        }
        double t = 0;
        for (int i = 1; i <= n; i++) {
            t = Math.sqrt(i + t);
        }
        System.out.println("S(n) = " + t);
    }
}
