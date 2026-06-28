package number_programs;

import java.util.Scanner;

public class ReverseTheNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your number:");
	int num=sc.nextInt();
	
	int rev=0;
	
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	
	System.out.println("The reverse number is : "+rev);
}
}
