
public class Overriding {

	public static void main(String args[]) {
		Box box1 = new Box(10,20,30);
		
		System.out.println(box1);
		Box box2 = new Box(40,50,60);
		box1 = box2;
		
		System.out.println(box2);
		System.out.println(box1);
	}
}
