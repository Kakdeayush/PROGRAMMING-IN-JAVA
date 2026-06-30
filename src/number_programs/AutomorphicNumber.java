package number_programs;

public class AutomorphicNumber {
public static void main(String[] args) {
	
	int num=5;
	int sqr=num*num;
	int temp=num;
	int divisor=1;
	
	while(num>0) {
		divisor=divisor*10;
		num/=10;
	}
	
	if(sqr%divisor==temp) System.out.println("Automorphic Number!!!!!");
	else System.out.println("Not a Automorphic Number!!");
}
}
