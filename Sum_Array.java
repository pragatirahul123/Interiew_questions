package Practice_Question;

public class Sum_Array {

	public static void main(String[] args) {
		int arr[][]= {{2,1,2},{2,3,1}};
		int i=0;
		int sum=0;
		for(i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				 sum=sum+arr[i][j];
			}
		}
			System.out.println(sum);
			
			}
		
	
}


