package package4;

public class TestFinallyBlock {
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4};
		System.out.println("Array: " +  arr[42]);
		try {
			
			int data = 25 / 0;
			System.out.println("data = " + data);
		} catch(ArithmeticException e) {
			System.out.println("Exception: " + e);
			System.out.println("Data cannot be divided by zero");
		} finally {
			System.out.println("Anything included in Finally block will always be executed");
		}
		
	}
}
