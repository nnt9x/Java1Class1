package day1a;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {

        long x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        x = in.nextLong();
        System.out.print("y = ");
        y = in.nextLong();
        // (3 + 6) / 2 = 4.5 (double)
        double tbc = (x + y ) / 2.0;
        // Chỉ lấy 2 chữ số sau thập phân
        System.out.printf("TBC x va y la %.2f", tbc);

    }
}
