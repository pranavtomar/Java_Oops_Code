package staticAssignment1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order();
		
		Food food1 = new Food();
		Food food2 = new Food();
		
		Food[] foods = {food1, food2};
		
		Order order1 = new Order(foods);
		
		System.out.println(order1.getOrderId());
		System.out.println(order1.getOrderId());
		System.out.println(order1.getTotalNoOfOrder());
		System.out.println(order1.getTotalNoOfOrder());
	}

}
