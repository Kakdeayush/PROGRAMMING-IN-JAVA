package Arrays;

public class SearchElement {
public static void main(String[] args) {
	int[]arr= {1,31,68,7,96,4};
	int input=4;
	boolean res =SearchElement(arr,input);
	System.out.println(input+" ----------->"+res);
}

public static boolean SearchElement(int[]arr,int input) {
	for( int i =0;i<arr.length;i++) {
		if(arr[i]==input) {
			return true;
		}
	}
	return false;
}
}
