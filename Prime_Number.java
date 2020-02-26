package Practice_Question;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int var = sc.nextInt();
		int result=0;
		for(int i=1;i<=var;i++) {
			if(var%i==0) {
			result=result+1;
			}
			
			
		}
		if (result == 2) {
			System.out.println("Prime Number");
		}else {
				System.out.println("Not Prime Number");
	}
}
	}

