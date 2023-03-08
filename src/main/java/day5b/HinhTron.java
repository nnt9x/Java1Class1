package day5b;

public class HinhTron {
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Ban kinh phai duong");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh)  {
        if(banKinh <= 0){
            throw new RuntimeException("Ban kinh phai duong");
        }
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
