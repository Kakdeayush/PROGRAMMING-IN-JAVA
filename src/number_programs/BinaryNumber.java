package number_programs;

public class BinaryNumber {
public static void main(String[] args) {
	int num=9;
	int bin=0;
	int position=1;
	
	while(num!=0) {
		int rem=num%2;
		bin=bin+position*rem;
		position=position*10;
		num/=2;
		
	}
	System.out.println(bin);
	
}
}
