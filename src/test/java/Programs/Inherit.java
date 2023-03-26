package Programs;

class Inherit {
	
	int sum= 0;

	void Add(int a, int b)
	{
		sum = a+b;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.Add(10, 11);
		obj.display();
	    
		
		

	}
	

}
	
	class B extends Inherit{
		
		void display() {
			System.out.println("It will display sub classes");
		}
		
	

}

