package Practice_Question;

public class Minimum_Question {
	public static void main (String[]args) {
	int arr[]= {3,5,8,9,6,4,13};
	int min = arr[0];
	
    for(int i=0; i<arr.length; i++ ) {
       if(arr[i]< min) {
          min = arr[i];
       }
    
    System.out.println(" minimum number " + min);
    break;
    }
}
}
	

