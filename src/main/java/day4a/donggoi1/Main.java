package day4a.donggoi1;

public class Main {
    public static void main(String[] args) {
        HinhTron h = new HinhTron();
//        h.banKinh = -4;
        h.setBanKinh(-5);
        System.out.println(h.chuVi());
        System.out.println(h.dienTich());
    }
}
