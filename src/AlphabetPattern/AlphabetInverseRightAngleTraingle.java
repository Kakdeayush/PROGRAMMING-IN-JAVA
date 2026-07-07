package AlphabetPattern;

public class AlphabetInverseRightAngleTraingle {
    public static void main(String[] args) {
		
    	int num=3;
    	
    	for(int i=1;i<num*2;i++) {
    		char ch='A';
    		
    		for(int j=1;j<num*2;j++) {
    			if(i+j<=num*2) {
    				System.out.print(ch++ + " ");
    			}
    			else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
	}
}
