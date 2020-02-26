package Practice_Question;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		 int num = 153, number, temp,total=0;

            number = num;
	        while (number != 0){        
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num) 
	           System.out.println("Amstrong number");
	        else 
        		 System.out.println("not amstrong number");

		
	}

}
