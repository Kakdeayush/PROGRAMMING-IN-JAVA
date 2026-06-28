package number_programs;

import java.util.Scanner;

public class ExtractDigitFromNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number:");
    int num=sc.nextInt();

    while(num!=0) {
    	int rem=num%10;
    	System.out.println(rem+" ");
    	num=num/10;
    	
    }
	
}
}
