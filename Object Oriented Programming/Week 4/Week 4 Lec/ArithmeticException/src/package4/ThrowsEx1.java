package package4;

public class ThrowsEx1 {
	public static void main(String args[])throws NumberFormatException {
		
		String data = "458ws";
		int value = Integer.parseInt(data);
		
		System.out.println("Value: " + value);
	}
}
