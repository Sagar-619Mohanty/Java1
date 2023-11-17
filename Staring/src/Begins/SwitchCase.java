package Begins;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a text");
	String text = sc.nextLine();
	
	switch (text) {
	case "Hy":
		System.out.println("Welcome to the jungle ");
		break;
	
	case "Bye":
		System.out.println("You are safe");
		break;
		
	default : 
		 System.out.println("Wrong Input");
	}
	 
	
}
}
