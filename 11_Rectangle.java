/*
	11. Create a rectangle class that contains width and height fields also give it a get area method again.
	Make a few test cases.
*/

import java.util.Scanner;

class Rectangle {
	double width, height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	void printInfo() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
	}
}

class RectangleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter height of rectangle: ");
		double height = scanner.nextDouble();

		System.out.println("Enter width of rectangle: ");
		double width = scanner.nextDouble();

		Rectangle rect1 = new Rectangle(width, height);

		rect1.printInfo();
	}
}