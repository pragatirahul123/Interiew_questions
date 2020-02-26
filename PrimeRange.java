package Practice_Question;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the range :-"); int start = sc.nextInt(); int end =
		 * sc.nextInt();
		 */
		//long startTime = System.currentTimeMillis();
		int i;
		for (i = 10; i <= 100000; i++) {
			if (isPrime(i))
				System.out.print(i + "\t");
		}
		System.out.println("\n");
		//System.out.println(System.currentTimeMillis() - startTime);
	}

	private static boolean isPrime(int number) {
		int i, factors = 0;
		for (i = 2; i <= Math.sqrt(i); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
