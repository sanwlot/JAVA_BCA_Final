/*
8. Write a program that reads two numbers from the command line, the number of hours worked by an
employee and their basic pay rate. Then output the total pay due. Add warning messages to the payroll
program if the pay rate is less than the minimum wage ($ 4.35 an hour as of mid 1996) or if the employee
worked more then the number of week.
*/

class DuePay {
	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("Please provide two numbers as command line arguments: hours worked and basic pay rate.");
			return;
    }
		try {
			double hoursWorked = Double.parseDouble(args[0]);
			double basicPayRate = Double.parseDouble(args[1]);
			
			final int MAX_ALLOWED_HOURS = 40;
			final double MINIMUM_WAGE_RATE = 4.35;
					
			if (hoursWorked > MAX_ALLOWED_HOURS) {
				System.out.println("Warning! The employee worked more than allowed limits");
			}
			if (basicPayRate < MINIMUM_WAGE_RATE) {
				System.out.println("Warning! pay rate is below minimum wage");
			}
			
			System.out.println("Total pay due: $" + hoursWorked * basicPayRate);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please provide valid numbers as command line arguments.");
			}
		} 
}
