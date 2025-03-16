package practice;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your marks and get your grade :: ");
	int marks = sc.nextInt();
	String result=null;
	
	if(marks>95) {
		result="the grade is A+ " +marks;
	}
	else if(marks>=85) {
		result="the grade is A and disnction "+marks;
	}
	else if(marks<85 && marks>=60) {
		result="the grade is B and 1ST Class "+marks;
	}
	else if(marks<60 && marks>=50) {
		result="the grade is c and 2nd Class "+marks;
	}
	else if(marks<50 && marks>35) {
		result="the grade is D and THIRD Class "+marks;
	}
	else if(marks==35) {
		result="the grade is E and PASS "+marks;
	}
	else if(marks<35) {
		result="the grade is F and FAIL "+marks;
	}
	
	System.out.println(result);
	sc.close();
	
	
	
	}

}
