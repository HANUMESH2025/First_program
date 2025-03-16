package practice;

public class ExceptionHandlingMessage {

	public static void main(String[] args) throws Exception{	
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			throw new ArithmaticException("dont devid any number with zero other its shows error ");
		}
	}

}
