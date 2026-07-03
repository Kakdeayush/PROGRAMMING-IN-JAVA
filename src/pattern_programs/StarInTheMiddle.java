package pattern_programs;

public class StarInTheMiddle {
public static void main(String[] args) {
	int row=5;
	int column=5;
	
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=column;j++) {
			if(i==3&&j==3) {
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
