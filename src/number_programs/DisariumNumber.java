package number_programs;

public class DisariumNumber {
	public static void main(String[] args) {
		int num=135;
		int sum=0;
		int temp1=num;
		
		
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		
		int temp2=temp1;
		while(temp1!=0) {
			int rem=temp1%10;
			int base=rem;
			int exp=count;
			int power=1;
			
			for(int i=exp;i>=1;i--) {
				power*=base;
			}
			sum+=power;
			temp1/=10;
			count--;
			
		}
		if(temp2==sum) System.out.println("Disarium  Number!!!");
		else System.out.println("Not a Disarium Number");
				
	}

}
