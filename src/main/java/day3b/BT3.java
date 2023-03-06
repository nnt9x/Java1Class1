package day3b;

import java.util.Random;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Nhap kich thuoc
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước: ");
        int n = in.nextInt();

        // Tao mang
        HinhTron[] arr = new HinhTron[n];
        // Khoi tao gia tri cho mang
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // Random ban kinh 1 -> 20
            int k = r.nextInt(20) + 1;
            arr[i] = new HinhTron(k);
        }
        // In ra mang hinh tron vua tap
        for (HinhTron ht : arr) {
            System.out.println(ht.toString());
        }

        // a. In ra hình có chu vi lớn nhất.
        double cvMax = 0;
        HinhTron tmp = null;
        for (HinhTron h : arr) {
            if (cvMax < h.tinhChuVi()) {
                cvMax = h.tinhChuVi();
                tmp = h;
            }
        }
        System.out.println("Hinh tron co chu vi lon nhat: " + tmp.toString());

        // b. In ra hình có diện tích bé nhất. (tuong tu)
        // c. Tính trung bình cộng của chu vi các hình tròn.

        double tongCv = 0;
        for (HinhTron h : arr) {
            tongCv = tongCv + h.tinhChuVi();
        }
        double tbcCv = tongCv / n;
        System.out.println("Trung binh cong chu vi =  " + tbcCv);

        // d. Có bao nhiêu hình có chu vi lớn hơn trung bình cộng chu vi
        //(tính ở ý c)

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i].tinhChuVi() > tbcCv){
                count ++;
            }
        }
        System.out.printf("Có tất cả %d hình lớn hơn TBC chu vi \n", count);

        // e. ?? Sap xep noi bot
        for (int i = 0; i < n-1 ; i++) {
            for(int j = i+1; j < n; j++ ){
                if(arr[i].banKinh < arr[j].banKinh){
                    HinhTron h = arr[i];
                    arr[i] = arr[j];
                    arr[j] = h;
                }
            }
        }

        for (HinhTron ht : arr) {
            System.out.println(ht.toString());
        }


    }
}
