
public class Student extends Person{
	
	protected int studentID;
	
	public Student(String name,String address,int studentID) {
		super(name,address);
		this.studentID = studentID;
	}
	public void showDetails() {
		super.showDetails();
		System.out.println("Student ID: "+this.studentID);
	}
}


