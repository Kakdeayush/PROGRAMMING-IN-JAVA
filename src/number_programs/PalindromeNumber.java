package number_programs;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter your number:");
	int num=sc.nextInt();
	
	int rev=0;
	
	int temp=num;
	
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
		
	}
	
	if(rev==temp) System.out.println("Palindrome number!!!!!!");
	else System.out.println("Not a Palindrome Numbber");
	
}
}
