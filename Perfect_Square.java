package Practice_Question;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 1st number");
		int first=sc.nextInt();
		System.out.println("enter a 2nd number");
		int second = sc.nextInt();
		int sum=1;
		for(int i=0;i<second;i++) {
			sum=sum*first;
		}
		
		System.out.println(sum);
		
		}
	}



		
			
		

	


