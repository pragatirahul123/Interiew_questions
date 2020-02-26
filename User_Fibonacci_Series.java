package Practice_Question;

import java.util.Scanner;

public class User_Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int var=sc.nextInt();
		int y=1;
		int x=0;
		while(x<=var) {
			System.out.println(x);
			int z=x;
			x=y;
			y=z+y;
		}

	}

}
