/*
 * 12. Create a square class with width and get area. Then, give both square and
 * circle set area methods that let you specify a desire area. Make a few test
 * cases.
 */

import java.util.Scanner;

class Square {
  private double width;

  Square(double width) {
    this.width = width;
  }

  double getWidth() {
    return width;
  }

  double getArea() {
    return width * width;
  }

  void setArea(double area) {
    width = Math.sqrt(area);
  }
}

class Circle {
  private double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double getRadius() {
    return radius;
  }

  double getArea() {
    return Math.PI * radius * radius;
  }

  void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}

class TestShapes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Test Square
    System.out.println("Enter width of the Square: ");
    Square square = new Square(scanner.nextDouble());
    System.out.println("Square Area: " + square.getArea());

    // setting desired area for square
    System.out.println("Enter desired area for the square: ");
    square.setArea(scanner.nextDouble());
    System.out.println("New Square width: " + square.getWidth());

    // Test Circle
    System.out.println("Enter radius of the Circle: ");
    Circle circle = new Circle(scanner.nextDouble());
    System.out.println("Circle Area: " + circle.getArea());

    // setting desired area for circle
    System.out.println("Enter desired area for the circle: ");
    circle.setArea(scanner.nextDouble());
    System.out.println("New Circle radius: " + circle.getRadius());

    scanner.close();
  }
}
