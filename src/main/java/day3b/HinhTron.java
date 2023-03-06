package day3b;

public class HinhTron {
    double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }

    public double tinhChuVi(){
        return banKinh * 2 * Math.PI;
    }

    public double tinhDienTich(){
        return  banKinh * banKinh * Math.PI;
    }
}
