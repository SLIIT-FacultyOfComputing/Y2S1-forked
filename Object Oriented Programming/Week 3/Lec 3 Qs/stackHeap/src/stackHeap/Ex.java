package stackHeap;

public class Ex {
	public static void main(String args[]) {
		
		Person person = new Employee(); //When you create inheritance objects, compiler thinks heap object
						// is same as the stack reference in compile time. 
						// BUT During runtime it assigns the sub class object to the super class reference
			//This method of creating sub class objects can ensure the inheritance works. 
		
		
		person.method(); 
		
		double value = 124.654;
		int no = (int)value;	//This is called casting 
		
		System.out.println("Double : " + value);
		System.out.println("Int of the same after casting: " + (int)value);
		
		
		double res = 4.53f + 4.15;
		
		System.out.println("Double float combo: "+ res);
		
		
		int multidimension [][] = new int[5][6];
		int multidimension2[][] = new int[][]{{5,4,6} ,{9,6,8}};      // Remember to not include values 
		int multidimension3[][] = new int[1][1];
		
		System.out.println("Multidimension2: " + multidimension2[1][1]);
		
		
}
}