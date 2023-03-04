package day2b;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        // Thuộc số tự nhiên
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        // Kiểm tra xem n có phải nguyên tố hay ko?
        // 2-> căn bậc 2 của n
        if (n < 0) {
            System.out.println("Không hợp lệ");
            System.exit(0);
        }

        if (n <= 1) {
            System.out.println("Không phải số tự nhiên");
            System.exit(0);
        }
        // mac dinh la so nguyen to
        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // Chỉ cần tìm 1 giá trị chia ko phải 1 và n
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }

    }
}
