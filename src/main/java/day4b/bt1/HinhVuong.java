package day4b.bt1;

public class HinhVuong extends HinhChuNhat{
    private double canh = 1;

    public HinhVuong(){

    }
    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
