package NumberPattern;

public class PyramidOuter123 {
   public static void main(String[] args) {
	
	   int num=3;
	   
	   for(int i=1;i<=num;i++) {
		   int m=1;
		   int n=i;
		   for(int j=1;j<num*2;j++) {
			   if(i+j>num&&j-i<num) {
				   if(j>=num) {
					   System.out.print(m++ +" ");
				   }
				   else {
					   System.out.print(n-- + " ");
				   }
			   }
			   else {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
}
}
