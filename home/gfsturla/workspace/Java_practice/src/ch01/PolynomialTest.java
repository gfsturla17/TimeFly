package ch01;

import java.util.Scanner;

public class PolynomialTest {
	public static void main(String[] args){
		
		int degree = 0;
		int i = 0;
		System.out.println("enter numbers");
		Scanner conIn = new Scanner(System.in);
		
		degree = conIn.nextInt();
		Polynominal p1 = new Polynominal(degree);
		
		for(i = 0; i <= degree; i++){
			p1.setCoefficient(degree-i, conIn.nextInt());
			
		}
		
		System.out.println(p1.evaluate(1));
		
		
		
		
		
		
		
		

	}

}
