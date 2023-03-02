package day1b;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // Gregorius
        // Input : >= 1582 -> trước mốc thời gian này ko xét
        // Năm nhuận: x % 400 == 0 || ( (x % 4== 0) && (x % 100 != 0) )

        // Bước 1: Nhập năm
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int x= in.nextInt();
        in.close();
        // Bước 2: Kiểm tra
        if(x < 1582){
            System.out.println("Không xác định!");
            System.exit(0);
        }
        if(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0)){
            System.out.println("Là năm nhuận!");
            System.exit(0);
        }
        System.out.println("Không nhuận");
    }
}
