package package4;

class MathOp {
	
	public int add(int x,int y) {
		return x + y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
}

class myMain{
	public static void main(String args[]) throws ArithmeticException{
		MathOp math = new MathOp();
		math.add(2,0);
		math.divide(2, 0);
	}
}
