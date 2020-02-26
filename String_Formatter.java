package Practice_Question;

public class String_Formatter {
	public static String reverseString(String str){
	    StringBuilder sb =new StringBuilder(str);  
	    sb.reverse();  
        return sb.toString();
	}


public static void main(String[] args) {  
   System.out.println(String_Formatter.reverseString("anom"));  
   
	}
}


	
