package oop.b6_1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        width = length = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return length;// or width
    }

    public void setSide(double side) {
        length = width = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
