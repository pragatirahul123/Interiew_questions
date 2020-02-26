package Practice_Question;

import java.util.Scanner;

public class Count_Alphabet_Digit_Whitespaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a text");
		String text =sc.nextLine();
		int alphabet = 0;
		int space=0;
		int digit=0;

		
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i) == ' ') 
				space++;
			if ((text.charAt(i)>=97 && text.charAt(i)<=122 )|| (text.charAt(i) >= 65 && text.charAt(i) <= 90))
				alphabet++;
			if (text.charAt(i) >= 48 && text.charAt(i) <= 57)
				digit++;
		}
		System.out.println("alphabet:" +alphabet);
		System.out.println("space:" + space);
		System.out.println("digit:" + digit );
	}
		

}
