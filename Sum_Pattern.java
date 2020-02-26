package Practice_Question;

import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many times");
		int var=sc.nextInt();
		for(int i=1;i<=var;i++) {
			System.out.print( i + "+" + "1"  + "/");
		}

	}

}
