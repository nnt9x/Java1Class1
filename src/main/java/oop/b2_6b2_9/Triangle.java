package oop.b2_6b2_9;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        if (v1.distance(v2) == 0 || v1.distance(v3) == 0 || v2.distance(v3) == 0) {
            throw new RuntimeException("Error");
        }
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "v1=" + v1 +
                ",v2=" + v2 +
                ",v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        double AB = v1.distance(v2);
        double BC = v2.distance(v3);
        double AC = v1.distance(v3);
        return (AB + BC + AC);
    }

    public String getType() {
        double AB = v1.distance(v2);
        double BC = v2.distance(v3);
        double AC = v1.distance(v3);

        if (AB == BC && BC == AC) {
            return "equilateral";
        } else if (AB == BC || AB == AC || BC == AC) {
            return "isosceles";
        }
        return "scalene";
    }
}
