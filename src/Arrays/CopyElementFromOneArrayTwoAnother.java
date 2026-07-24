package Arrays;

public class CopyElementFromOneArrayTwoAnother {
   public static void main(String[] args) {
	   int[]arr1= {1,4,6,8,9};
		int[]arr2=new int [arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
}
	
	

}
