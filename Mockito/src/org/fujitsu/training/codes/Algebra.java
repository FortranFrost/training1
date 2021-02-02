package org.fujitsu.training.codes;

public class Algebra {

	private Mathematics math = new Mathematics(); // Has-A relationship with mathematics
	
	public Algebra(Mathematics math) {
		this.math = math;
	}
	
	public int getExpression(int x, int y) { // this will not proceed if y = 0; we proceed to mocking
		return 2000 + math.div(x, y) + math.div(x, y);
	}
	
}
