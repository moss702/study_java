package lesson08.shape;

public class Circle extends Shape {
	int r ; //조상 Shape가 반지름 값을 안가지고 있어서 내가 만들엇음
	public Circle() {}
	public Circle(int r) {
		this.r = r;
	}
	public double circum() {
		return 2 * r * Math.PI;
	}
	public double area() {
		return r * r * Math.PI;
	}
}
