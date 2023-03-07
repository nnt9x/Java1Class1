package oop.b4_1_composition;


public class Cylinder {
    // Thuoc tinh: chieu cao va day
    private double height = 1;
    private final Circle circle;

    public Cylinder(){
        circle = new Circle();
    }
    public Cylinder(double height, Circle circle){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = circle;
    }
    public Cylinder(double height, double radius){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius);
    }
    public Cylinder(double height, double radius, String color){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public double getVolume(){
        return circle.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", circle=" + circle +
                '}';
    }

    public double getAroundArea(){
        return circle.getPerimeter() * height;
    }

    public double getTotalArea(){
        return getAroundArea() + 2 * circle.getArea();
    }
}
