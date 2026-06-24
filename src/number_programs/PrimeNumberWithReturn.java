package number_programs;

import java.util.Scanner;

public class PrimeNumberWithReturn {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your number :");
	int num=sc.nextInt();
	if(IsPrime(num))System.out.println("Prime Number");
	else System.out.println("Not a Prime Number");
	
}
public static boolean IsPrime(int num) {
	int count =0;
	for(int i=1;i<=num;i++) {
		count++;
	}
	return count==2;
}
}
