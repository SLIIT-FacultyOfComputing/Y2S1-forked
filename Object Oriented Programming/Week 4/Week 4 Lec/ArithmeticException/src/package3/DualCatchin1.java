package package3;

public class DualCatchin1 {
	public static void main(String args[]) {
		int x = 0;
		int value = 0;
		try {
			int a = 42;
			int b = 0;
				x = a / b;
		String name = "da123";
		value = Integer.parseInt(name);
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("Exception : " +e);
		}
		System.out.println("X = " + x + "Value = " + value);
		
	}
}	
