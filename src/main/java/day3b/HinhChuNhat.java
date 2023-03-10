package day3b;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    // Contructor - phương thức khơi tạo
    public HinhChuNhat(){

    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }

    // Alt + insert chon toString

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
