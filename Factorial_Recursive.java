package Practice_Question;

public class Factorial_Recursive {
	static int factorial(int n) {
		if (n==0) 
			return 1;
			else 
				return(n*factorial(n-1));
	}
				
		
public static void main(String[] args) {
	int i;
	int fact;
	int number =4;
	fact=factorial(number);
	System.out.println(fact);
}

		
	

	}


