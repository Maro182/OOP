//9.9
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygon() {
    }
    RegularPolygon(int n , double side) {
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n , double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
    public double getPerimeter() {
        return n * side;
    }
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    @Override
    public String toString() {
        return "Polygon perimeter : " + getPerimeter() + " area : " + getArea();
    }
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6 , 4);
        RegularPolygon rp3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);

        System.out.println("rp1 : "+rp1.toString());
        System.out.println("rp2 : "+rp2.toString());
        System.out.println("rp3 : "+rp3.toString());
    }
}
