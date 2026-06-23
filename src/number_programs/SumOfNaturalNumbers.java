package number_programs;

import java.util.Scanner;

public class SumOfNaturalNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the start point:");
	int start=sc.nextInt();
	System.out.println("Enter the end point");
	int end=sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		sum+=i;
		
	}
	System.out.println("Sum:"+sum);
	
}
}
