package Begins;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("Enter a text: ");
//	 
//	String value = sc.nextLine();
//	
//	System.out.println(value + " new line");
	
	int value  = 0 ;
	do {
		System.out.println("Enter a number: ");
		value  = sc.nextInt();
	}
	while (value != 5) ;
		System.out.println("stop");
		

  }
}