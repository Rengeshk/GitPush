package org.control;

public class Ladder {
public static void main(String[] args) {

	int a=50, b=70,c=90;
	
	// && represents AND
	
	if (a>b && a>c) {
	System.out.println("A is Greater");
}
	else if (b>a && b>c) {                         
	System.out.println("B is Greater");
}
	else if (c>a && c>b) {                    //90>50-True AND 90>70-True
		System.out.println("C is Greater");
	}
	else {
		System.out.println("Nothing is Greater");
	}
	
	// || represents OR
	
	if (a>b || a>c) {
		System.out.println("A is Greater");
	}
	else if (b>a || b>c) {                   //70>90-False OR 70>50-True
		System.out.println("B is Greater");
	}
	else if (c>a || c>b) {
		System.out.println("C is Greater");
	}
	else {
		System.out.println("Nothing is Greater");
	}
}
}
