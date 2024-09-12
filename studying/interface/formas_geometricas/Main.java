public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Rectangle rectangle = new Rectangle(2.0, 3.0);

        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        Circle circle = new Circle(2.0);

        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
    }
}
