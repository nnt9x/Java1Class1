package day3b;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Kich thuoc mang
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        size = in.nextInt();

        // Khai bao mang int[] arr = new int[3]
        HinhChuNhat[] arr = new HinhChuNhat[size];

        // Nhap du lieu cho mang
        for (int i = 0; i < size; i++) {
            // Nhap chi tiet cho arr[i]
            System.out.println("Hinh chu nhat thu " + i);
            System.out.print("Chieu dai: ");
            double chieuDai = in.nextDouble();
            System.out.print("Chieu rong: ");
            double chieuRong = in.nextDouble();
            // Tao doi tuong hinh chu nhat o vi tri index i
            arr[i] = new HinhChuNhat(chieuDai, chieuRong);
        }
        in.close();

        // In ra mang
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
        // In ra hinh chu nhat co dien tich lon nhat?

        double dtMax = arr[0].tinhDienTich();
        int vtMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (dtMax < arr[i].tinhDienTich()) {
                dtMax = arr[i].tinhDienTich();
                vtMax = i;
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat la");
        System.out.println(arr[vtMax].toString());
        System.out.println("Dien tich max la " + dtMax);

    }
}
