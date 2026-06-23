package number_programs;

import java.util.Scanner;

public class PrintNaturalNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start point ");
	int start=sc.nextInt();
	System.out.println("Enter the end point");
	int end =sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		System.out.println(i);
	}
}
}
