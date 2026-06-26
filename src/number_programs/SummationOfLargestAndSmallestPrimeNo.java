package number_programs;

import java.util.Scanner;

public class SummationOfLargestAndSmallestPrimeNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter starting point:");
	int start= sc.nextInt();
	System.out.println("Enter ending point:");
	int end= sc.nextInt();
	
	int smallest =0;
	int largest =0;
	
	for(int i=start;i<=end;i++) {
		int count =0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			smallest+=i;
			break;
			
		}
	}
	
	
	for(int i=end;i>=start;i--) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		
		if(count==2) {
			largest+=i;
			break;
		}
	}
	
	 int sum=smallest+largest;
	 System.out.println("The sum of largest and smallest prime number : "+ sum);
	
}
}
