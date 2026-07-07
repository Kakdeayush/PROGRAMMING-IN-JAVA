package NumberPattern;

public class NumberPatternIncreaseByOneAnd {
public static void main(String[] args) {
	
	int num=3;
	
	for(int i=1;i<num*2;i++) {
		int m=i;
		int n=2*num-i;
		
		for(int j=1;j<num*2;j++) {
			if(i<=j) {
				System.out.print(m++ + " ");
			}
			else
			{
				System.out.print(++n + " ");
			}
		}
		System.out.println();
	}
}
}
