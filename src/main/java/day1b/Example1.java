package day1b;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*
        Nhập số nguyên x từ bàn phím, in ra x là số âm hay dương?
         */
        // Input: số nguyên x
        // Output: kết luận x âm hay dương?

        // Xác định biểu thức logic (condition) ?
        // x > 0 -> dương
        // x == 0 -> không âm không dương
        // x < 0 -> âm

        // Bước 1: Khai báo và nhập x
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        in.close();
        // Bước 2: kiểm tra và đưa kết luận
        if(x > 0){
            System.out.println(x + " là số dương");
        }
        if(x == 0){
            System.out.println(x + " là số không âm không dương");
        }
        if(x < 0){
            System.out.println(x + " là số âm");
        }
    }
}
