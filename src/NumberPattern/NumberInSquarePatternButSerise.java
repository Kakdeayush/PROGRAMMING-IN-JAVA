package NumberPattern;

public class NumberInSquarePatternButSerise {
    public static void main(String[] args) {
		
    	int num=3;
    	
    	
    	for(int i=1;i<num*2;i++) {
    		int m=i;
    		int n=1;
    		for(int j=1;j<num*2;j++) {
    			if(i+j<=num*2) {
    				System.out.print(m++ + " ");
    			}else
    			{
    				System.out.print(n++ + " ");
    			}
    		}
    		System.out.println();
    	}
	}
}
