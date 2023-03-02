package day1a;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        long a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b: ");
        a = in.nextLong();
        b = in.nextLong();
        in.close();

        System.out.printf("%d : %d dư %d", a, b, a%b);
    }
}
