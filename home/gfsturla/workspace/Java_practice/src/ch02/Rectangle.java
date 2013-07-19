package ch02;

public class Rectangle implements FigureGeometry {
	private float length;
	private float width;
	
	

	public Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public float perimeter() {
		return 2*length + 2* width;
	}

	@Override
	public float area() {
		return length * width;
	}

	@Override
	public void setScale(int scale) {
		// TODO Auto-generated method stub
	}

	@Override
	public float weight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
