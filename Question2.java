package Practice_Question;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println(num + "*"+ i + "=" + num*i);				
			}

}
}
