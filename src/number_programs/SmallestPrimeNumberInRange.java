package number_programs;

import java.util.Scanner;

public class SmallestPrimeNumberInRange {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Starting point :");
		int start=sc.nextInt();
		System.out.println("Enter Ending point:");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i + " is a prime no");
				break;
			}
		}
	}

}
