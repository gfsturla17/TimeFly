package ch02.stringLogs;

public class Matrix implements SquareMatrix{
	int n;
	int [][] matrix;
	int i;
	int col;
	int row;
	int c;


	
	public Matrix(int row, int column){
			matrix = new int[row][column];
			
	}
	
	@Override
	public void makeEmpty(int n) {
		this.col = n;
		this.row = n;
		
		for(i = 0; i <= row; i++){
			for(c = 0; c<=col; c++){
				matrix[i][c]=0;
			}
			
		}
		
	}
	

	@Override
	public void storeValue(int i, int j, int value) {
		matrix[i][j]=value;
		
	}

	public Matrix add(Matrix b) {
		return b;
		
		
	}

	@Override
	public SquareMatrix subtract(SquareMatrix a, SquareMatrix b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SquareMatrix copy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int printValue(int a, int b){
		int value = matrix[a][b];
		return value;
	}

}
