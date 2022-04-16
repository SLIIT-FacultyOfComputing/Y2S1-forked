
public class MyMain {
	public static void main(String args[]) {
		
		System.out.println("Hello!");
		
		int a = 10;
		int b = 15;
		int c = 15;
		int x = 0;
		try {
			x = a /(b-c);
		// In this equation there is an exception thrown due to division by zero
		//These are arithmeticExceptions which are unchecked. which means it will be thrown in runtime
		}catch (ArithmeticException e) { //e is a reference variable
			//YOU NEED TO GET THE RIGHT EXCEPTION AS WELL
			System.out.println("Cannot divide by zero"); //This avoids the termination
		} // Try and Catch implemented
		
		System.out.println("Bye");
		System.out.println("x = " + x);
		int y = a /(b+c);
		System.out.println("y = " + y);
		
	}
}
