package Begins;

public class Whileloop {
	public static void main(String[] args) {
		int value = 1 ;
		while (value < 13 ) {
		
			System.out.println("hy");
		 
			value = value +1 ;
		}
		
		int j = 0 ; 
		for (j = 1 ; j < 3 ; j++) {
			System.out.println(j);
		}
		
		int integer = 20 ; 
		if (integer < 5 ) {
			System.out.println("Statement is true");
		}
		else if (integer > 20) {
			System.out.println("this is true");
		}
		else {
			System.out.println("none of the above");
	    }
	
		int s = 1 ;
		
		while (s < 5 ) {
			System.out.println("looping" + s);
		
			if(s == 5) {
				break;
			}
			
			s++;
			
			
		}
		
		
	}
}
