package practice;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) throws ArithmeticException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
		
		try {
		result=a/b;
		System.out.println("no exception ");
	}
		catch (Exception ae) {
	 System.out.println(ae.getMessage());
	 
	}
		finally {
			System.out.println("dont worry all is well ");
		}
		
	}

}
