import java.util.Scanner;

public class Triangle extends GeometricObject{
    private double side1 , side2 , side3;
    public Triangle(){
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
class TestTriangle{
    public static void main(String[] args) {
        System.out.println("enter the three sides for triangle: , color & filled ");
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(sc.next());
        triangle.setFilled(sc.nextBoolean());
        System.out.println("Area is : "+triangle.getArea()+" perimeter is : "+triangle.getPerimeter());
        System.out.println("color is : "+triangle.getColor()+" filled is : "+triangle.isFilled());

    }
}
