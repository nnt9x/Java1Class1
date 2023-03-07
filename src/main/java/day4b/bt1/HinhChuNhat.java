package day4b.bt1;

public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        /*
        Khi thuoc tinh -> ko hop le -> nem ra exception
         */
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat[" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + tinhChuVi() +
                ", dienTich=" + tinhDienTich() +
                ']';
    }
}
