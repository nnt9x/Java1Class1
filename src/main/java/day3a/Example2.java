package day3a;

import java.util.Random;

public class Example2 {
    //  1. Hàm không có giá trị trả về và ko có tham số.
    public static void sayHello() {
        System.out.println("Hello, welcome to Java");
    }

    // 2. Hàm không có giá trị trả vè và có tham số
    public static void sayHello(String language) {
        System.out.println("Hello, welcome to " + language);
    }

    // 3. Hàm có giá trị trả về và không có tham số (OOP - dùng nhiều hơn)
    public static int getRandomNumber() {
        // 0 -> 999
        return new Random().nextInt(1000);
    }

    // 4. Hàm có giá trị trả về và có tham số
    // Viết hàm tính tổng 2 số thực
    public static double sumAB(double a, double b){
        return (a + b);
    }


    public static void main(String[] args) {
        sayHello();
        sayHello("PHP");
        sayHello("Python");
        // Những hàm - phương thức có giá trị trả về
        // In ra tổng của 2 số ngẫu nhiên
        int number1 = getRandomNumber();
        int number2 = getRandomNumber();
        int t = number1 + number2;
        System.out.println("T = " + t);
        // Tính tổng 3 số ??? x, y, z
        double x = 1.5, y = 2.5, z = 10.5;

        double k = sumAB( sumAB(x, y), z);
        System.out.println(k);

    }
}
