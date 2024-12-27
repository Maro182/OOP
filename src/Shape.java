public class Shape {
    private String name;

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

 class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

 class TestShape {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(4,6);
        printArea(square);
        printArea(rectangle);
        printPerimeter(square);
        printPerimeter(rectangle);
    }

    public static void printArea (Shape s){
        System.out.println(s.getArea());
    }
    public static void printPerimeter (Shape s){
        System.out.println(s.getPerimeter());
    }
}
