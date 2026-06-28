package number_programs;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number:");
    int num=sc.nextInt();
    
    int sum=0;
    
    
    int temp=num;
    
    while(num!=0) {
    	int rem=num%10;
    	int fact=1;
    	for(int i=rem;i>=1;i--) {
    		fact*=i;
    	}
    	
    	sum+=fact;
    	num/=10;
    }
    
    if(temp==sum) System.out.println("Spy Number!!!");
    else System.out.println("Not a Spy Number!!!");
    
    
}
}
