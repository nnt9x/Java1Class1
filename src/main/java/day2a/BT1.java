package day2a;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // S(n) = 1 + 2 + ...+ n
        // Input: n - long ( n >= 1)
        // Output: S(n)

        // Bước 1: Nhập n
        Scanner in = new Scanner(System.in);
        System.out.print("N = ");
        long n = in.nextLong();
        in.close();

        // Bước 2: Kiểm tra n
        if (n < 1) {
            System.out.println("n không thoả mãn");
            System.exit(0);
        }
        // Bước 3: Vòng lặp
        long sn = 0;
        for (int i = 1; i <= n; i++) {
            sn = sn + i;
        }
        System.out.println("Tổng = " + sn);

    }
}
