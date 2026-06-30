package number_programs;

public class HappyNumber {
	public static void main(String[] args) {
		
		int num=19;
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			int sqr=rem*rem;
			sum=sum+sqr;
			num/=10;
			
			if(num==0) {
				if(sum>9) {
					num=sum;
					sum=0;
				}
				
			}
		}
		if(sum==1) System.out.println("Happy Number!!!!!!");
		else System.out.println("Not a Happy Number!!");
	}

}
