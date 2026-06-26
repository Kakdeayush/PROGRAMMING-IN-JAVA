package number_programs;

import java.util.Scanner;

public class LargestPrimeNoInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting point :");
		int start = sc.nextInt();
		System.out.println("Enter Ending point :");
		int end = sc.nextInt();
		
		for(int i=end;i>=start;i--) {
		    if(IsPrime(i)) {
		    	System.out.println(i +" is  a largest prime no ");
		    	break;
		    }
		}
	}
	
	public static boolean IsPrime(int num) {
		int count =0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2;
	}
}
