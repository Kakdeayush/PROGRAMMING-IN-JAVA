package NumberPattern;

public class SquarePatternIncrementBy10 {
    public static void main(String[] args) {
		
    	int num=5;
    	
    	for(int i=1;i<=num;i++) {
    		int m=i;
    		int n=0;
    		for(int j=1;j<=num;j++) {
    			if(j%2!=0) {
    				System.out.print(m + " ");
    				m=m+num*2;
    			}else
    			{
    				n=num*2-i+1;
    				System.out.print(n + " ");
    			}
    		}
    		System.out.println();
    	}
	}
}
