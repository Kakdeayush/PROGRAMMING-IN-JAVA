package number_programs;

import java.util.Scanner;

public class ProductOfNaturalNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number:");
	int number=sc.nextInt();
	int product=1;
	
	for(int i=1;i<=number;i++) {
		product*=i;
		
	}
	System.out.println("Product:"+product);
}
}
