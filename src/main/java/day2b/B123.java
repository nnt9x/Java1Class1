package day2b;

import java.util.Random;
import java.util.Scanner;

public class B123 {
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
            System.out.println(arr[i]);
        }

        // Cần tìm vị trí đầu tiên đạt giá trị min
        int min = arr[0];
        int indexMin = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                indexMin = i;
                min = arr[i];
            }
        }
        //
        System.out.printf("Min = %d, tại vị trí %d \n", min, indexMin);
    }
}
