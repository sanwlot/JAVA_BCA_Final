// 14. Write an application program in Java to implement the different uses of final keyword.

// try to extend the final class
final class FinalClass {
  // create a final variable
  static final int MAX_LIFE = 100;
}

class A extends FinalClass {
  public final void display() {
    System.out.println("This is a final method.");
  }
}

class B extends A {
  // try to override the final method from class A
  // public final void display() {
  // System.out.println("The final method is overridden.");
  // }
}

class Main {
  public static void main(String[] args) {
    // try to change the final variable
    // FinalClass.MAX_LIFE = 120;

    System.out.println("Max life: " + FinalClass.MAX_LIFE);
  }
}

// final variable => to create constant variables
// final method => prevents method overriding
// final class => prevents inheritance
