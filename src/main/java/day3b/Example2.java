package day3b;

public class Example2 {
    public static void main(String[] args) {
        // Tạo đối tượng HCN 3, 4
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.chieuDai = 3;
        hcn1.chieuRong = 4;

        System.out.printf("Chu vi = %.2f, diện tích %.2f \n",
                hcn1.tinhChuVi(), hcn1.tinhDienTich());

        // Tao HCN 2 voi day du tham so
        HinhChuNhat hcn2 = new HinhChuNhat(5, 6);

        System.out.printf("Chu vi = %.2f, diện tích %.2f \n",
                hcn2.tinhChuVi(), hcn2.tinhDienTich());

        // Tao HCN 3 - voi cac du lieu nhap tu ban phim-> in ra
        // Tu lam


    }
}
