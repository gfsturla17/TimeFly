package ch02.stringLogs;

public class Matrixtester {
	
	public static void main(String[] args){
		
		Matrix m = new Matrix(5, 5);
		Matrix c = null;
		 m.storeValue(0, 0, 3);
		 m.storeValue(4, 4, 1);
		 m.storeValue(2, 1, 2);
		 m.makeEmpty(3);
		 
		 Matrix c1 = m.add(c);
		 System.out.println(m.printValue(0, 0));
		 System.out.println(m.printValue(4, 4));
		 System.out.println(m.printValue(2, 1));
		
	}

}
