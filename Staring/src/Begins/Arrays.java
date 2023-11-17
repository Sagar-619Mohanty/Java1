package Begins;

public class Arrays {
public static void main(String[] args) {
	int[] value ;
	value = new int[4];
	value[0] = 10;
	value[1] = 20;
	value[2] = 30;
	value[3] = 400;
	System.out.println(value[0]);
	System.out.println(value[1]);
	System.out.println(value[2]);
	
	for (int i=3 ; i < value.length; i++) {
		System.out.println(value[i]);
	}
	int[] digits = {1,2,3,4,5};
	for (int i=0 ; i < digits.length ; i++) {
		System.out.println(digits[i]);
	}
	
	String[] names = {"sagar", "subham" , "Rakesh" , "Pratyush"};
	for (String name: names ) {
		System.out.println(name);
	}
	
	int values = 0 ;
	String text = null ;
	System.out.println(text);
	String[] texts = new String[2];
	System.out.println(texts[1]);
	
	int[][] grid  = 
		{
				{3,4,5,121346},
				{7,8,9},
				{1,4,7,3,5}
		};
	System.out.println(grid[2][3]);
	
	String[][] texts1 = new String[2][3];
	texts1 [0][1] = "Welcome to Multi-d Arrays";
	System.out.println(texts1[0][1]);
	
	for(int i=0 ; i<grid.length ; i++) {
		for(int j=0 ; j<grid[i].length; j++) {
			System.out.print(grid[i][j] + "\t");
		}
		System.out.println();
	}
	
}
}
