public class Feet {
	
	private int feet;
	private int inches;
	
	public Feet(int feet, int inches) {
		
		this.feet = feet;
		this.inches = inches;
	}
	//overloaded constructor that can accept another feet object
	public Feet(Feet obj) {
		
		this.feet = obj.feet;
		this.inches = obj.inches;
		
	}
	
	public void add(Feet f1, Feet f2) {
		
		int totFeet = f1.feet + f2.feet;
		int totInch = f1.inches + f2.inches;
		
		if(totInch > 12) {
			totInch  = totInch - 12;
			totFeet++;
		}
		//Question says store them in the current Feet object
		this.feet = totFeet;
		this.inches = totInch;
		
		//System.out.println(totFeet + "' " + totInch + " \n");
	}
	public void add(Feet obj) { //overloaded method 
		
		int newFeet, newInches;
		newFeet = this.feet + obj.feet;
		newInches = this.inches + obj.inches;
		
		if(newInches >=  12)
		{
			newInches = newInches - 12;
			newFeet ++;
		}
		this.feet = newFeet;
		this.inches = newInches;
	}
/*	public static void add (Feet f1, Feet f2) {
		
	} */ // In this situation you can see that having the same method with same arguments but 
		// having a difference of static will still be considered a duplicate. therefore 
		// you cannot duplicate the same method and create it as a static
	
	public static Feet add(Feet x, Feet y, Feet z) {
		int newFeet, newInches;
		newFeet = x.feet + y.feet + z.feet;
		newInches = x.inches + y.inches + z.inches;
		
		if(newInches >=  12 && newInches <=24)
		{
			newInches = newInches - 12;
			newFeet ++;
		}
		else if(newInches >= 24) {
			newInches = newInches -24;
			newFeet = newFeet  + 2;
		}
		
		Feet alpha = new Feet(newFeet,newInches);
		return alpha;
	}
	public void print() {
		System.out.println(this.feet + "' " + this.inches + "\"");
	}
	public void print(String msg) {	//overloaded print method
		System.out.println(msg +this.feet + "' " + this.inches + "\"");
	}
	public static void print(Feet obj) { //overloaded static print method
		System.out.println("Static Printing :" +obj.feet + "' " + obj.inches);
	}
}