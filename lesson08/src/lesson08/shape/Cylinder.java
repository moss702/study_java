package lesson08.shape;

public class Cylinder extends Shape implements Shape3D {
	Circle circle; //원의 반지름과 너비를 가져올거임
	int z;

	Cylinder() {
	}
	Cylinder(Circle circle, int z){
		this.circle = circle;
		this.z = z;
	}
	public double area() {
		return circle.area() * 2 + circle.circum() * z;
	}	
	public double volume() {
		return circle.area() * z;
	}	//원의 너비 * 높이 = 부피
}
