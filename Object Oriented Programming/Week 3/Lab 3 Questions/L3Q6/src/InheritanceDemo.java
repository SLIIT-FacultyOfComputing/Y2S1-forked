
public class InheritanceDemo {
	public static void main(String args[]) {
		
		Student stud1 = new Student("Devindu","55C,Colombo",21003332);
		
		stud1.showDetails();
		
		Student part2 = new PartTimeStudent("Pinky","CMB",21003335,4.5); 
		
		part2.showDetails();
	}
}
