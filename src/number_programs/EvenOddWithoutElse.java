package number_programs;

import java.util.Scanner;

public class EvenOddWithoutElse {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter your number :");
	int num=sc.nextInt();
	String res="Odd";
	if(num%2==0) {
		res="Even";
	}
	System.out.println(res);
}
}
