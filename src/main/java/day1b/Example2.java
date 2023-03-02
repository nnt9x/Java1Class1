package day1b;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Switch-case: làm việc với các giá trị cụ thể
        // Nhập vào tháng -> hiển thị ra số ngày trong tháng
        // Input: tháng - số nguyên (1-12)
        // Output: số ngày trong tháng
        // 30 ngày: 4 6 9 11
        // 31 ngày: 1 3 5 7 8 10 12
        // T2: 28 hoặc 29 ngày (tuỳ năm nhuận hay ko)

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int x = in.nextInt();
        in.close();
        if(x < 1 || x > 12){
            System.out.println("Tháng không hợp lệ!");
            System.exit(0);
        }
        switch (x){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Có 31 ngày!");
                break;
        }
    }
}
