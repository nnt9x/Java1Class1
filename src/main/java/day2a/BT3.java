package day2a;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
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
        double sn = 0;
        for(long i = 1; i <= n; i++){
            sn = sn + 1.0/i;
        }
        System.out.println(sn);
    }
}
