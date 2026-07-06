package pattern_programs;

public class InverseOfPyramid {
public static void main(String[] args) {
	
	int num=3;
	
	for(int i=1;i<=num;i++) {
		for(int j=1;j<num*2;j++) {
			if(i+j<=num*2 && j>=i) {
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
