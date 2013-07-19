package ch02.stringLogs;

public interface SquareMatrix {
	
	void makeEmpty(int n);
		//sets the first rows n rows and columns to zero
	
	void storeValue( int i, int j, int value);
		//stores value at position at row i column j.
	
	SquareMatrix add(SquareMatrix a, SquareMatrix b);
		//adds two matrices together
	
	SquareMatrix subtract(SquareMatrix a, SquareMatrix b);
		//subtracts Matrix a from Matrix b
	
	SquareMatrix copy();
		//copies one matrix into another
}
