package Arrays;

public class CopyEvenIndexElementIntoAnotherArray {
      public static void main(String[] args) {
		int arr1[]= {1,2,37,4,8};
		
		int size=(arr1.length%2==0?arr1.length/2:arr1.length/2+1);
		
		int []res=new int [size];
		System.out.println(res.length);
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			if(i%2==0) {
				res[k++]=arr1[i];
				
			}
		}
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]+" ");
		}
			
		
	}
}
