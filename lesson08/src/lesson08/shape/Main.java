package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3); //반지름이 3인 circle
//		System.out.println(circle.area()); //넓이
//		System.out.println(circle.circum()); //둘레	
		
		Rect rect = new Rect(4,5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
		
		Cylinder cylinder = new Cylinder(new Circle(4),5);
		
		Shape[] shapes = {circle, rect, cylinder}; //조상타입으로 자식인스턴스들의 배열을 만들수있다!
		
		for(int i = 0 ; i < shapes.length ; i++) {
			System.out.println("======"+ shapes[i].getClass().getSimpleName() +"======");
			//동적바인딩을 통해 인스턴스 정보를 가져와 자기 이름을 안다..
			System.out.println("넓이 : " + shapes[i].area());
			if(shapes[i] instanceof Shape2D) {
				System.out.println("둘레 : " + ((Shape2D)shapes[i]).circum());
			}
			else if(shapes[i] instanceof Shape3D) {				
				System.out.println("부피 : " + ((Shape3D)shapes[i]).volume());
			}
	//		System.out.println(shapes[i].circum());
			//main 클래스에서 주석처리했지만, Shape에 잘 살아있기 때문에 찾아서 해옴!
			//심지어 Shape 클래스의 0이 아닌, main의 값을 가져와서 잘 계산한다.
		}
		System.out.println("==================");
		for(Shape s : shapes){//toString 오버라이딩 한다면
			System.out.println(s);
		}
		
	}
}
