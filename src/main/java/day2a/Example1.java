package day2a;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // In ra các số chẵn trong đoạn [a, b]
        // Input: a, b - long (a < b)
        // Output: in ra các số chẵn

        // Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("a, b = ");
        long a = in.nextLong();
        long b = in.nextLong();
        in.close();
        if (a >= b) {
            System.out.println("Không thoả mãn");
            System.exit(0);
        }
        // Bước 2: Vòng lặp
        for (long i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
