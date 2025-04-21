package lesson08.shape;

public class tri extends Shape {

	int x, y;
	
	public tri() {}
	public tri(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double circum() {
		return 0;
	}

	public double area() {
		return (x * y) / 2;
	}

}
