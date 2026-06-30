package number_programs;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number: ");
	
	int num=sc.nextInt();
	int temp1=num;
	int sum=0;
	
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
			power=power*base;
		}
		sum+=power;
		temp1/=10;
	}
	
	if(temp2==sum) System.out.println("Armstrong Number!!!");
	else System.out.println("Not a Armstrong Number");
}
}
