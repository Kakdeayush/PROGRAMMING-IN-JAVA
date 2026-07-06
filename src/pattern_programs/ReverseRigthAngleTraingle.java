package pattern_programs;

public class ReverseRigthAngleTraingle {
public static void main(String[] args) {
	int num=3;
	
	for(int i=1;i<num*2;i++) {
		for(int j=1;j<num*2;j++) {
			if(j>=i) {
				System.out.print("* ");
			}else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
