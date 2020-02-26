package Practice_Question;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int var=1234;
		int i;
		int rev=0;
		while(var!=0) {
			i=var%10;
			rev =rev*10+i;
			var=var/10;
		}
		System.out.println(rev);
	}
}