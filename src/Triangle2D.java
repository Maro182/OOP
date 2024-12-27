public class Triangle2D {
    MyPoint p1, p2, p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean contains(MyPoint p) {
        double maxX = Math.max(p1.getX(), Math.max(p2.getX(), p3.getX()));
        double maxY = Math.max(p1.getY(), Math.max(p2.getY(), p3.getY()));
        double minX = Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));
        double minY = Math.min(p1.getY(), Math.min(p2.getY(), p3.getY()));
        if (p.getX() > minX && p.getX() < maxX && p.getY() > minY && p.getY() < maxY) {
            return true;
        }
        return false;
    }

    public boolean contains(Triangle2D t) {
        MyPoint point1 = new MyPoint(t.getP1().getX(), t.getP1().getY());
        MyPoint point2 = new MyPoint(t.getP2().getX(), t.getP2().getY());
        MyPoint point3 = new MyPoint(t.getP3().getX(), t.getP3().getY());
        return contains(point1) && contains(point2) && contains(point3);
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,1);
        MyPoint p2 = new MyPoint(-3,-2);
        MyPoint p3 = new MyPoint(-2,3);
        Triangle2D test = new Triangle2D(p1, p2, p3);
        System.out.println("perimeter: " + test.getPerimeter());
        System.out.println("Area: " + test.getArea());
        System.out.println("contains with point: " + test.contains(new MyPoint(1,1)));
        System.out.println("contains with triangle: " + test.contains(new Triangle2D(
                new MyPoint(-2,2) , new MyPoint(-1 , 0) , new MyPoint(-1 , -4)
        )));
    }
}
