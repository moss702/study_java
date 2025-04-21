package lesson08.shape;

public abstract class Shape {
//	public abstract double circum() ; //둘레
	public abstract double area() ; //면적
	
	public String toString() {
		return "넓이 : " + area();
	}
	
}

