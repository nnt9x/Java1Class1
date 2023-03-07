package day4a.donggoi1;

public class BT1 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(0, 4);
        System.out.println(hcn1);
        System.out.println("Chu vi: " + hcn1.chuVi());
        System.out.println("Dien tich: " + hcn1.dienTich());


        HinhChuNhat hcn2 = new HinhChuNhat(3, 4);
        System.out.println(hcn2);
        System.out.println("Chu vi: " + hcn2.chuVi());
        System.out.println("Dien tich: " + hcn2.dienTich());
    }
}
