package Practice_Question;

public class Duplicate_String {

	public static void main(String[] args) {
		char arr[]= {'a','d','s','r','s','a'};
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) { 
                    System.out.println(arr[i]); 
                
			}
			
		}

	}
	}
}

