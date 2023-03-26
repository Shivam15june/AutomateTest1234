package Programs;

public class ArrayBasics {

	public static void main(String[] args) {
		
		String cars[] = {"BMW" , "Farari" , "Audi" , "RangeRover"};
		System.out.println(cars[2]);
		cars[1]= "Mercedes";
		System.out.println(cars[1]);
		System.out.println(cars.length); //length of the string
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		
		

	}

}
