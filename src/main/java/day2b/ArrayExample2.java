package day2b;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample2 {
    /*
    Tạo một mảng gồm n phần tử. Nhập giá trị cho mảng và in ra.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = in.nextInt();
        in.close();
        if(n < 1){
            System.out.println("Kích thước mảng không hợp lệ!");
            System.exit(0);
        }
        Random random = new Random();
        // Tao mang
        int[] arr = new int[n];

        // Lặp n lần
        // Mỗi lần lặp -> gán giá trị ngẫu nhiên cho mảng vừa nhập
        for (int i = 0; i < n; i++) {
            // 0 -> 999
            arr[i] = random.nextInt(1000);
        }
        // In ra mang vua tao
        for (int i = 0; i < n; i++){
            System.out.printf("arr[%d]=%d \n",i, arr[i]);
        }

    }
}
