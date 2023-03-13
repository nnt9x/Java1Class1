package day8a.functional;

public class Main {
    public static void main(String[] args) {
        MyFunctional sum = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };

        System.out.println("Tong 3 va 5 = " + sum.calculator(3.0, 5.0));

        // Dinh nghia 1 phuong thuc tinh bieu thuc
        // A = 5*a + 3*b - 10
        MyFunctional expression = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return 5 * a + 3 * b - 10;
            }
        };

        System.out.println(expression.calculator(1, 2));

        // Thường định nghĩa trong trường hợp cần dùng đến
        // Thường kết hợp với Stream API và Lambda expression

    }
}
