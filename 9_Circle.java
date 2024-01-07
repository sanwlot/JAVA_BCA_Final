/*
	9. Give your circle a get area method that calculates its area,
		and a print info method that prints out the radius and area.
		Make a test case that tries capabilities out.
*/

import java.util.Scanner;

class Circle {
	// instance var
	double radius;

	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// instance methods
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public void printInfo() {
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + getArea());
	}
}

class CircleTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();

		// create a circle object
		Circle circle = new Circle(radius);

		// print info about that cirlce
		circle.printInfo();
	}
}