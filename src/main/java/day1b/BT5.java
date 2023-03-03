package day1b;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int x = in.nextInt();
        System.out.print("Nhập năm: ");
        int y = in.nextInt();

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
                if(y >= 1582 && y % 400 == 0 || (y % 4==0 && y % 100 != 0)){
                    System.out.println("Có 29 ngày");
                }
                else {
                    System.out.println("Có 28 ngày");
                }
                break;
            default:
                System.out.println("Có 31 ngày!");
                break;
        }
    }
}
