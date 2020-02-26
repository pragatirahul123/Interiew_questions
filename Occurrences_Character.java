package Practice_Question;

import java.util.ArrayList;

public class Occurrences_Character {

	public static void main(String[] args) {
		char[] arr = {'a', 'n', 't', 'a', 'a', 't', 'n', 'n', 'a', 'x', 'u', 'g', 'a', 'x', 'a'};
		ArrayList<Character> list=new ArrayList<Character>();
		ArrayList longList=new ArrayList();
		for (char i : arr) {
			if(!list.contains(i)) {
				list.add(i);
			}
		
		}
			
		for (char a : list) {
			int counter=0;
			for(char v : arr) {
				if(a==v) {
					counter+=1;
				}
			}		
			System.out.println(a +" " + counter);
			}	
		

		

	}

}
