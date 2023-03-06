package day3b;

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

    }
}
