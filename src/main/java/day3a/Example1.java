package day3a;

public class Example1 {
    /*
    Viết phương thức tinhTong() 2 số thực a và b.
     */
    public static void tinhTong(double a, double b) {
        double t = a + b;
        System.out.println("SUM = " + t);
    }

    public static void main(String[] args) {
        // C1:
        // Nhập dữ liệu từ bàn phím -> tính toán

        // Truyền trực tiếp đối số  -> tính toán
        double x = 10.5;
        tinhTong(3, x);

    }

}
