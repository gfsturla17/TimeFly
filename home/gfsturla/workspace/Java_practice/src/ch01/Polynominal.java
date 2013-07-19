package ch01;

public class Polynominal {
	private int[] coeff;
	float degree;
	float sum;
	float curr;
	int i;
	
	public Polynominal(int degree){
		this.coeff = new int[degree+1];
		this.degree = degree;
			
		}
		
	
	
	public void setCoefficient(int degree, int number){
		coeff[degree]= number; 
	}

	public float evaluate(float value){
		sum = 0;
		for( i = 0; i <= degree; i++){
			sum += coeff[i] * Math.pow(value, i);
	}
		return sum;

}
	
	
	
}