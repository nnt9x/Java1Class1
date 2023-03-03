package day2a;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        // Nhập chuỗi từ bàn phím -> in ra chuỗi viết hoa
        // Chương trình sẽ dừng khi người dùng nhập exit
        // a -> A
        // bkacad -> BKACAD
        // exit -> Thoát khỏi chương trình

        // Lặp lại ở đây là gi?
        // Nhập, chuyển sang viét hoa, in

        String s = "";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập chuỗi: ");
            s = in.nextLine();
            if(s.equalsIgnoreCase("exit")){
                // Thoát khỏi vòng lặp
                break;
            }
            s = s.toUpperCase();
            System.out.println("Viết hoa: " + s);
        }
        in.close();

        /*
        In ra cac so tu 1-> 10 sử dụng while
         */
    }
}
