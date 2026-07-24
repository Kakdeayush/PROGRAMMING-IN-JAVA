package Arrays;

public class PrintEvenIndex {
	public static void main(String[] args) {
		
		
		 int[] arr= {1,4,6,7,9};
		    
			for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					System.out.print(arr[i]+" ");
				}
			}
			
	}
   
}
