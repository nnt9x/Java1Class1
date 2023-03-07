package oop.b4_1_composition;

public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2, 3);
        // Tinh the tich
        System.out.println(c1.getVolume());
        // Tinh dien tich day??
        System.out.println(c1.getCircle().getArea());

        // Dien tich xung quanh
        System.out.println(c1.getAroundArea());
    }
}
