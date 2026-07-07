package AlphabetPattern;

public class HourGlassAlphabetPattern {
  public static void main(String[] args) {
	
	  int num=3;
	  char ch ='A';
	  
	  for(int i=1;i<num*2;i++) {
		  for(int j=1;j<num*2;j++) {
			  if((j>=i&&j+i<=num*2)||( i>=j && i+j>=num*2) ) {
				  System.out.print(ch++ + " ");
			  }
			  else {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
}
}
