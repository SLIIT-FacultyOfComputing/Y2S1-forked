package package4;

//import java.awt.desktop.SystemSleepEvent;

public class NestingTry {
	public static void main(String args[]) {
		
		try {
			try {
				try {
					int arr[] = {1,2,3,4};
					System.out.println(arr[10]);
				}catch(ArithmeticException e) {
					System.out.println("Exception : " + e);
					System.out.println("handled in Try block three");
				}
			}catch(ArithmeticException e) {
				System.out.println("Handled in Try block two");
				System.out.println("Exception: " + e);
			}
		}catch(ArithmeticException e3) {
			System.out.println("Exception: " + e3);
			System.out.println("Handled by main try-block");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Exception: " +e4);
			System.out.println("Handled by main try-block");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Handled by main try-block");
		}//finally {
			//System.out.println("End of Operation!");
		//}
	}
}

//This shows that the error made in tryblock three has been caught by the main block multi catch
//block
