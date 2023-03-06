package day3a;

import java.util.Scanner;

public class B116 {

    // S(n) = 1 + ... + n
    // Sn
    // Tham số: int n (n >= 1)
    // Giá trị trả về: int
    // n>= 1 -> Tính tổng Sn
    // nếu n <= 0 -> -1

    public static int sn(int n){
        if(n < 1){
            // Đánh dấu cho biết n ko thoả mãn
            return -1;
        }
        int t = 0;
        for(int i = 1; i <= n; i++){
            t = t + i;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        int tmp = sn(n);
        if(tmp != -1) {
            System.out.printf("S(%d) = %d \n", n, sn(n));
        }
        else {
            System.out.printf("n = %d là không hợp lệ\n",n);
        }

        // [1, 3, -5, 0, 7, 8]
        // sn(1) + sn(3) + sn(7) + sn(8)

    }
}
