package number_programs;

import java.util.Scanner;

public class SpyNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number:");
	int num=sc.nextInt();
	
	int sum=0;
	int prod=1;
	
	while(num!=0){
		int rem=num%10;
		sum +=rem;
		prod *=rem;
		num /=10;
		
	}
	
	if(sum==prod) System.out.println("Is a Spy Number!!!");
	else System.out.println("Not a Spy Number");
	
}
}
