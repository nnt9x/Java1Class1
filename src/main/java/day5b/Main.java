package day5b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Viet 1 chuong trinh tinh thuong a/b. Chuong trinh se dung khi
        tinh dc 1 phep tinh dau tien?
         */
        // Nhap a, b
        int a, b;
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("a, b = ");
                a = Integer.parseInt(in.next());
                b = Integer.parseInt(in.next());
                in.nextLine();
                // Thuc hien phep chi
                System.out.println("a/b = " + (a / b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai dữ liệu!");
            } catch (ArithmeticException e) {
                System.out.println("Lỗi chia cho 0!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        in.close();
    }
}
