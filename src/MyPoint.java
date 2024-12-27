public class MyPoint {
    public double x;
    private double y;
    public MyPoint() {
        this(0.0 , 0.0);
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow((x - p.getX()), 2) + Math.pow((y - p.getY()), 2));
    }
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    public double distance(int x1 , int y1){
        return Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(5 , 10);
        MyPoint p2 = new MyPoint(3 , 6);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(3 , 6));
        System.out.println(MyPoint.distance(p1, p2));

    }
}
