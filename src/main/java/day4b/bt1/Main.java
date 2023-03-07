package day4b.bt1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(4);
        System.out.println(hcn);

        HinhVuong hv = new HinhVuong();
        hv.setCanh(5);

        hv.setChieuRong(10);
        hv.setChieuDai(8);

        System.out.println(hv);
        // Chốt lại trong TH này ko nên để kế thừa
        // Sử dụng trừu tuong

    }
}
