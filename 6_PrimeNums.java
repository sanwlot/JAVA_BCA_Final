//6. Write a program that reads two numbers from command line and print all the prime numbers between them.

class PrimeNums {
	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("Please provide two numbers as command line arguments.");
			return;
		}
		
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		
		for (int i = start; i <= end; i++) {
			if (i > 1 && isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

