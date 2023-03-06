package day3b;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Tạo đối tượng d1
        Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "Pitbull";
        d1.color = "Black & white";
        d1.age = 2;

        // Hanh vi
        d1.eat();
        d1.run();
        // Tạo đối tương d2 - dữ liẹu nhập từ bàn phím
        // Dùng các phương thức: run(), eat(), sleep()
        Dog d2 = new Dog();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập id: ");
        d2.id = Integer.parseInt(in.nextLine());
        System.out.print("Nhập tên: ");
        d2.name = in.nextLine();
        System.out.print("Nhập màu: ");
        d2.color = in.nextLine();

        d2.run();
        d2.eat();
        d2.sleep();
    }
}
