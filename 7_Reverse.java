//7. Write a program that prints command line arguments in reverse order.

// class Reverse {
// 	public static void main(String args[]) {
// 		for (int i = args.length -1; i >= 0; i--) {
// 			System.out.println(args[i]);
// 		}
// 	}
// }

// OR reverse the string 

class Reverse {
	public static void main(String args[]) {
		String input = args[0];
		String reversed = new StringBuilder(input)
			.reverse()
			.toString();
		System.out.println("Reversed string: " + reversed);
	}
}
