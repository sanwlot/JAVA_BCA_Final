/*
 10. make a program that create an array of 10 circle, each with a random radius. 
     Print out the sum of area of the 10 circles. Also print the biggest and smallest areas.
*/

// Define a Circle class with a radius attribute and methods to calculate the area and print information about the circle.
class Circle {
  double radius;

  // Constructor to initialize the circle with a given radius.
  Circle(double radius) {
    this.radius = radius;
  }

  // Method to calculate and return the area of the circle.
  double getArea() {
    return Math.PI * radius * radius;
  }

  // Method to print information about the circle, including its radius and area.
  void printInfo() {
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + getArea() + "\n");
  }
}

// Define a CircleArray class to create an array of circles, calculate and print
// the sum, and find the smallest and largest areas.
class CircleArray {
  public static void main(String[] args) {
    // Create an array to hold 10 Circle objects.
    Circle[] c = new Circle[10];
    double sum = 0;

    // Loop to create 10 circles with random radii and calculate the sum of their
    // areas.
    for (int i = 0; i < 10; i++) {
      c[i] = new Circle(Math.random() * 10);
      sum += c[i].getArea();
    }

    double min, max;

    // Initialize min and max with the area of the first circle.
    min = max = c[0].getArea();

    // Loop through the circles to print information, update min, and max.
    for (int i = 0; i < 10; i++) {
      c[i].printInfo();

      // Update min if the current circle has a smaller area.
      if (c[i].getArea() < min)
        min = c[i].getArea();

      // Update max if the current circle has a larger area.
      if (c[i].getArea() > max)
        max = c[i].getArea();
    }

    // Print the calculated minimum, maximum, and sum of areas.
    System.out.println("Min Area: " + min);
    System.out.println("Max Area: " + max);
    System.out.println("Sum of Areas: " + sum);
  }
}

// class Circle {
// double radius;

// Circle(double radius) {
// this.radius = radius;
// }

// double getArea() {
// return Math.PI * radius * radius;
// }

// void printInfo() {
// System.out.print("Radius : " + radius);
// System.out.println("\t Area : " + getArea());
// }
// }

// class CircleArray {
// public static void main(String[] args) {
// Circle[] c = new Circle[10];
// double sum = 0;

// for (int i = 0; i < 10; i++) {
// c[i] = new Circle(Math.random() * 10);
// sum += c[i].getArea();
// }

// double min, max;

// min = max = c[0].getArea();

// for (int i = 0; i < 10; i++) {
// c[i].printInfo();

// if (c[i].getArea() < min)
// min = c[i].getArea();
// if (c[i].getArea() > max)
// max = c[i].getArea();
// }

// System.out.println("Min : " + min);
// System.out.println("Max : " + max);
// System.out.println("Sum : " + sum);
// }
// }