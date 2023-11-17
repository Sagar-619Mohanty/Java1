package Begins;

class Person {
	int age ;
	
	int CalculateAge() {
		int currentAge = age + 1;
		return currentAge;
	}
	int getAge() {
		return age ; 
	}
}

public class Methods {
	String name ;
	int no;
	
	void Function() {
		for (int i=0; i<2 ; i++) {
			System.out.println("It is a " + name + "method and it has " + no  +" methods");
		}
	}
	
public static void main(String[] args) {
	Methods m = new Methods ();
	m.name = "static ";
	m.no = 2 ; 
	m.Function();
	
	
	Methods m1 = new Methods();
	m1.name = "Non-Static";
	m1.no = 3 ;
	m1.Function();
	
	System.out.println(m.name);
	System.out.println(m1.no);
	
	Person p = new Person ();
	p.age = 23;
	
	int years = p.age;
	System.out.println(p.CalculateAge());
	
	int age = p.getAge();
	System.out.println(age);
	
}
}
