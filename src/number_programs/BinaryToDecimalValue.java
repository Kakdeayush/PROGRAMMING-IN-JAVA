package number_programs;

public class BinaryToDecimalValue {
public static void main(String[] args) {
	int bin=1001;
	int num=0;
	int position=1;
	while(bin!=0) {
		int rem =bin%10;
		num=num+position*rem;
		position=position*2;
		bin/=10;
	}
	System.out.println(num);
}
}
