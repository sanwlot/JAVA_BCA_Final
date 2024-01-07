//Write a program to calculate income tax for the given income of user as per rules.

import java.util.Scanner;

class IncomeTax {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your salary: ");
		int salary = scanner.nextInt();
		
		if (salary <= 250000) {
			System.out.println("You do not need to pay tax");
		} else if (salary > 250000 && salary <= 500000 ) {
			System.out.println("Tax for your salary is: " + salary * 0.05);
		} else if (salary > 500000 && salary <= 1000000 ) {
			System.out.println("Tax for your salary is: " + salary * 0.2);
		} else if (salary > 1000000) {
			System.out.println("Tax for your salary is: " + salary * 0.3);
		}
	}
}