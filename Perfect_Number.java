package Practice_Question;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int var=sc.nextInt();
		int sum=0;
        for(int i = 1; i < var; i++){
        		if(var % i == 0){
        		sum = sum + i;

            }
        }

        if(sum == var) {
            System.out.println(" Perfect Number");
        }else

        	System.out.println(" Not Perfect");

        } 
}

	
	