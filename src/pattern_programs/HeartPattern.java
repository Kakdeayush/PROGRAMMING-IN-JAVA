package pattern_programs;

public class HeartPattern {
   public static void main(String[] args) {
	int num=7;
	
	for(int i=1;i<=num-1;i++) {
		for(int j=1;j<=num;j++) {
			if((i>j||j>i)&&(i+j==4 || i+j==3 || j-i==5) || (j>i&& i+j==6 ||i+j==10) || (i>j && i-j==2) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
