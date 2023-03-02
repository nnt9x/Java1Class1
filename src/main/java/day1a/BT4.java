package day1a;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        long x, y, z, t;
        System.out.print("x, y, z, t = ");
        Scanner in = new Scanner(System.in);
        x = in.nextLong();
        y = in.nextLong();
        z = in.nextLong();
        t = in.nextLong();

        in.close();
        // Bieu thuc
        boolean A = (2 * x > 5) && (3 * y < 10) || (5*z + 6 > t);
        System.out.println(A);
    }
}
