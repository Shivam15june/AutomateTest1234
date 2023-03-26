package Programs;

public class Example2 {
	
	
	void display() {
		System.out.println("It is a parent class");
	}
}
class Test extends Example2{

	void visible() {
		System.out.println("It is a child class");
	}

	public static void main(String[] args) {
	
		Test obj = new Test();
		obj.display();
		obj.visible();
		
	}

}
