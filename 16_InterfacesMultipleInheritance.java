// 16. Write a program to demonstrate multiple inheritances using interface

// Define the first interface
interface Animal {
  void eat();

  void sleep();
}

// Define the second interface
interface Bird {
  void fly();

  void sing();
}

// Implement a class that inherits from both interfaces
class Sparrow implements Animal, Bird {
  @Override
  public void eat() {
    System.out.println("Sparrow is eating");
  }

  @Override
  public void sleep() {
    System.out.println("Sparrow is sleeping");
  }

  @Override
  public void fly() {
    System.out.println("Sparrow is flying");
  }

  @Override
  public void sing() {
    System.out.println("Sparrow is singing");
  }
}

class MultipleInheritanceDemo {
  public static void main(String[] args) {
    // Create an instance of the Sparrow class
    Sparrow sparrow = new Sparrow();

    // Call methods from both interfaces
    sparrow.eat();
    sparrow.sleep();
    sparrow.fly();
    sparrow.sing();
  }
}

// the Sparrow class implements both the Animal and Bird interfaces,
// demonstrating multiple inheritances. The main method then creates an instance
// of the Sparrow class and calls methods from both interfaces.