package day1a;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        /*
        Nhập 2 số nguyên a, b từ bàn phím. Sau đó in ra tổng của chúng!
         */

        // Bước 1: Khai báo biến
        int a;
        int b;
        // Bước 2: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextInt();

        System.out.print("b = ");
        b = in.nextInt();
        // Dong phan nhap du lieu tu ban phim
        in.close();

        // Bước 3: Tính tổng và in
        int t = a + b;
        System.out.printf("%d + %d = %d", a, b, t );


    }
}
