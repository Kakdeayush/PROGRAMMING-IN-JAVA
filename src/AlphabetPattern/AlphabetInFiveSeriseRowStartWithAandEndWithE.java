package AlphabetPattern;

public class AlphabetInFiveSeriseRowStartWithAandEndWithE {
     public static void main(String[] args) {
		int num=3;
		
		
		for(int i=1;i<num*2;i++) {
			  char ch='A';
			for(int j=1;j<num*2;j++) {
				
				System.out.print(ch++ + " ");
			}
			
			System.out.println();
		}
	}
}
