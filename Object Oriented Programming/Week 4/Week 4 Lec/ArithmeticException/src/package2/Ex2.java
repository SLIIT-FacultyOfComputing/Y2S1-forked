package package2;

public class Ex2 {
	public static void main(String args[]) {
		int d = 0,a = 0;
		try {
		
		d = 0;
		a = 42 /d;
		System.out.println("This will not be printed"); //This wont be executed because 
			//Exception happens during the arithmeticException therefore the line after the error 
			// does not pass
		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e);
			System.out.println("Division by Zero");
		}
		System.out.println("value of A: " + a);
		
		String number = "132a";
		int value = 0;
		
		try {
			value = Integer.parseInt(number);
		}catch(NumberFormatException e) {
			System.out.println("Exception: " + e);
			System.out.println("Letters cannot be converted to integers");
		}
		
		////////// MULTI CATCH CLAUSES /////////////////////
			try {
				int ab = args.length;
				System.out.println("a = " + ab);
				int bdup = 42 /ab;
				int c[] = {1};
				c[42] = 99;
				System.out.println(c[42]);
			}catch(ArithmeticException e) {
				System.out.println("Exception : " + e);
			}catch(ArrayIndexOutOfBoundsException sa ) {
				System.out.println("Exception : " + sa);
			}
			
			System.out.println("After try/catch blocks");
	}
}
