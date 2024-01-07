// 15. Write an application program in Java to implement the different uses of super keyword.

class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println("Animal is eating...");
  }
}

class Dog extends Animal {
  String breed;

  Dog(String name, String breed) {
    // Calling the parent class constructor using super
    super(name);
    this.breed = breed;
  }

  void bark() {
    System.out.println("Dog is barking...");
  }

  void displayDetails() {
    // Accessing the parent class field using super
    System.out.println("Name: " + super.name);
    System.out.println("Breed: " + this.breed);
  }

  void eat() {
    // Calling the parent class method using super
    super.eat();
    System.out.println("Dog is eating...");
  }
}

class SuperKeywordExample {
  public static void main(String[] args) {
    Dog myDog = new Dog("Buddy", "Labrador");

    // Calling methods using the Dog class object
    myDog.displayDetails();
    myDog.bark();
    myDog.eat();
  }
}

// The super keyword in Java is used to refer to the immediate parent class
// object. It is used to invoke the immediate parent class methods, access the
// immediate parent class fields, and call the parent class constructor.

// The Animal class has a constructor and a method eat.

// The Dog class extends the Animal class and has its own constructor, methods
// (bark, displayDetails), and overrides the eat method.

// The super keyword is used to call the parent class constructor, access the
// parent class field, and invoke the parent class method within the Dog class.