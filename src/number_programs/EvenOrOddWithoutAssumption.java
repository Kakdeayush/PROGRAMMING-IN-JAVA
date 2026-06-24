package number_programs;

import java.util.Scanner;

public class EvenOrOddWithoutAssumption {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter your number :");
	int num=sc.nextInt();
	
	if(num/2*2==num) {
		System.out.println("Even");
	}
	else {
		System.out.println("Odd");
	}
}
}
