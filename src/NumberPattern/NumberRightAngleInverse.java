package NumberPattern;

public class NumberRightAngleInverse {
    public static void main(String[] args) {
		
    	int num=3;
    	
    	for(int i=1;i<num*2;i++) {
    		for(int j=1;j<num*2;j++) {
    			if(i+j<=num*2) {
    				System.out.print(j + " ");
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
	}
}
