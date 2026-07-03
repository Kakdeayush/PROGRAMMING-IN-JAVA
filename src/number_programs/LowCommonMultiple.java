package number_programs;

public class LowCommonMultiple {
    public static void main(String[] args) {
		
    	int num1=5;
    	int num2=10;
    	
    	int lcm=0;
    	int max=(num1>num2?num1:num2);
    	
    			
    	for(int i=max;i<num1*num2;i=i+max ) {
    		if(i%num1==0&&i%num2==0) {
    			lcm=i;
    			break;
    		}
    	}
    	System.out.println("The LCM between this two number is : "+lcm);
	}
}
