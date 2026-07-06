package pattern_programs;

public class HollowDiamondPattern {
 public static void main(String[] args) {
	
	 int num=3;
	 
	for(int i=1;i<num*2;i++) {
		for(int j=1;j<num*2;j++) {
			if(i+j==num+1 || i+j==num*3-1 || i*j==num*num || j-i==num-1 || i-j==num-1 ) {
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
