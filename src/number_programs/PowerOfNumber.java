package number_programs;

import java.util.Scanner;

public class PowerOfNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number:");
	int num=sc.nextInt();
	System.out.println("Enter the power:");
	int exp=sc.nextInt();
	
	int prod=1;
	
	for(int i=exp;i>=1;i--) {
		prod*=num;
	}
	System.out.println(prod);
}
}
