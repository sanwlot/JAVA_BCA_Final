//3. Create an array of 4 random numbers.

// imported Arrays for getting the "toString" method
import java.util.Arrays; 

class RandomNumbers {
	public static void main(String args[]) {
		int[] randomNums = new int[4];
		
		for (int i = 0; i < 4; i++) {
			randomNums[i] = (int) (Math.random() * 101);
		}
		System.out.println(Arrays.toString(randomNums));
	}
}


// we cant directly log array in Java so I had to use toString method from Arrays import
