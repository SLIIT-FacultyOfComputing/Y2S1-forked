package Exercise2;

interface iComputer{
	void calculate();
	void display();
}

class Person implements iComputer{
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}
	
	public void calculate() {
		netSal = basicSal + (otRate * otHrs);
	}
	public void display() {
		System.out.println("Net Salary of "+ name+ ": " + netSal );
	}
}

class Box implements iComputer{
	private int length, width, height;
	private int volume;
	
	public Box(int length2, int width, int height) {
		length = length2;
		this.width = width;
		this.height = height;
	}
	
	public void calculate() {
		volume = length * width * height;
	}
	
	public void display() {
		System.out.println("Volume of Box = " + volume);
	}
}

class MainFile {
	public static void main(String args[]) {
		iComputer ob1 = new Person("Danushka",4000,1000,5);
		ob1.calculate();
		ob1.display();
		
		iComputer ob2 = new Box(10,20,30);
		ob2.calculate();
		ob2.display();
	}
}
