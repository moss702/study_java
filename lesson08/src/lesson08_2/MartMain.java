package lesson08_2;

public class MartMain {
	public static void main(String[] args) {
		//매개변수의 다형성
		Buyer 송성준 = new Buyer();
		송성준.buy(new AirCon());
		송성준.display();
		송성준.buy(new Computer());
		송성준.buy(new Computer());
		송성준.display();
		송성준.buy(new Computer());
		송성준.display();
	}
}

// 상품 기반 클래스
class Product {
	int price ;
	public Product(int price) {
		this.price = price;
	}
	public String toString() {
		return getClass().getSimpleName() + "[" + price + "]";
	} //getSimple인스턴스의 현재네임을 따라가는거라서 자손의 이름을 가져온다.
}
//==================================
class Cooker extends Product { //생성자에 대한 호출이 이뤄지지 않으면 빨간라인.
	public Cooker() { //super (product)에 생성자가 있어서
		super(50); 	
	}
}
class Computer extends Product {
	public Computer() {
		super(200);
	}
}
class AirCon extends Product{
	public AirCon() {
		super(500);
	}
}
//==================================

class Buyer {
	Product[] products = new Product[10];
	int count;
	int amount = 1000;
	
	public void buy(Product product) {
		if(product.price <= amount) {
			products[count++]=product;
			amount -= product.price; //상품값 빼기
		}
		else {
			System.out.println("잔액부족 : 구매 불가능");
		}
	}
	
	public void display() {
		System.out.println("현재 구매한 물품");
		String str = " ";
		for(int i = 0 ; i < count ; i++) {
			str += products[i] + " ";
		}
		System.out.println(str);
		System.out.println("현재 잔고 : " + amount);
	}
}