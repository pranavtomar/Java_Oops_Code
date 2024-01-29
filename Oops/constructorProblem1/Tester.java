package constructorProblem1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order();
		System.out.println("Status of order 1: "+ order1.status);
		
		Order order2 = new Order(1001, "Garlic Shrimp");
		System.out.println("Status of order 2: "+ order2.status);
		System.out.println("Id of order 2: "+ order2.orderId);
		System.out.println("Items ordered in order 2: "+ order2.orderedFoods);
	}

}
