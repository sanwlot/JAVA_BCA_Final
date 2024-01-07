/*
	13. Write an application program in Java to implement the different uses of static keyword.
*/

class StaticDemo {
	// Static variable
	static int staticVar = 10;

	// Static method
	static void staticMethod() {
		System.out.println("This is a static method.");
	}

	// Static block
	static {
		staticVar = 100;
		System.out.println("This is static block.");
	}

	// Instance variable
	int instanceVar;

	// Instance method
	void instanceMethod() {
		System.out.println("This is a instance method.");

		// calling static method in the instance method.
		// staticMethod();
	}

	// Constructor
	StaticDemo(int instanceVar) {
		this.instanceVar = instanceVar;
	}
}

class StaticTest {
	public static void main(String[] args) {
		// Accessing static variable and method without creating an instance of the
		// class
		System.out.println("Static variable: " + StaticDemo.staticVar);
		StaticDemo.staticMethod();

		// Instantiation StaticDemo class
		StaticDemo sd1 = new StaticDemo(777);
		System.out.println("Instance variable: " + sd1.instanceVar);
		sd1.instanceMethod();

		// we can also access static methods/vars from objects
		// sd1.staticMethod();
	}
}
