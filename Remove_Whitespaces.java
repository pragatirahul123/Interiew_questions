package Practice_Question;

import java.util.Scanner;

public class Remove_Whitespaces {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("write a text");
		String var=sc.nextLine();
		var=var.replaceAll( "\\s", "");
		System.out.println(var);

	}

}