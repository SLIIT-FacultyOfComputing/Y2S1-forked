import java.util.*;

public class MainFile{
	public static void main(String args[]) {
		
	/*	Scanner input = new Scanner(System.in);
		int cond;
		System.out.println("Main Menu\n1. Addition\n2. Substraction\n::");
		cond = input.nextInt();
		int x, y;
		if(cond == 1) {
			
			
			System.out.println("Please enter first number:");
			x = input.nextInt();
			System.out.println("Please enter the second number: ");
			y = input.nextInt();
			System.out.println("Addition = " + Calculation.addition(x, y));
		}
		else if(cond == 2) {
			
			System.out.println("Please enter first number: ");
			x = input.nextInt();
			System.out.println("Please enter second number: ");
			y = input.nextInt();
			System.out.println("Substraction = " + Calculation.substraction(x, y));
		}
		input.close();
		//Consider the Calculation Q to be something irrelevant
		*/
		Feet f1 = new Feet(5,8);
		Feet f2 = new Feet(6,5);
		f1.print("F1 Length: ");
		
		f1.add(f1, f2);
		f1.print("F1 Length: ");
		
		Feet f3 = new Feet(0,0);
		f3.add(f1, f2);
		f3.print("F3 Length: ");
		
		Feet f4 = new Feet(f3);
		f4.add(f4,f2);
		f4.print("F4 copies F3's Length which is : ");
		
		f1.add(f4);
		f1.print("Overloaded Addition Occured: ");
		
		//Running static print method 
		Feet.print(f2);
		
		Feet f5 = new Feet(2,8);
		Feet f6 = new Feet(5,8);
		Feet f7 = new Feet(5,9);
		Feet f9 = new Feet(5,10);
		
		f5 = Feet.add(f6, f7, f9);
		Feet.print(f5);
	}
}