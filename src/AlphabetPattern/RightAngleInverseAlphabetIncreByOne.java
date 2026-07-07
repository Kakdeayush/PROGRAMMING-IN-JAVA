package AlphabetPattern;

public class RightAngleInverseAlphabetIncreByOne {
public static void main(String[] args) {
	
	int num=3;
	char ch ='A';
	
	for(int i=1;i<num*2;i++) {
		
		for(int j=1;j<num*2;j++) {
			
			if(i+j<=num*2) {
				System.out.print(ch++ + " ");
			}
			else {
				System.out.print(" ");
			}
		}
		
		ch='A';
		ch++;
		System.out.println();
		
	}
}
}
