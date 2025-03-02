public class R05_OBJ01_J {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
    }
}

class Shape {
    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
