package Practice_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Question {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 1st  text");
		String x=sc.nextLine();
		System.out.println("enter a 2nd text");
		String y= sc.nextLine();
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			//System.out.println(a);
			//System.out.println(b);
			if(Arrays.equals(a, b)) {
				System.out.println("Anagram ");	
			}
			else {
				System.out.println("Not Anagram");
			}
	}
}
			
	
	

	
	

	


