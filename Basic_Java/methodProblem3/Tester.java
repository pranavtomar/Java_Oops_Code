package methodProblem3;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.length = 12f;
		rectangle.width = 5f;
		
		System.out.println("Area of the rectangle is "+rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is "+rectangle.calculatePerimeter());
		
		
	}

}
