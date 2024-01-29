package Problem1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwiftFood food = new SwiftFood();
		
		food.orderedId = 101;
		food.orderFoods = "Spanach Alfredo Pasta";
		food.status = "Ordered";
		food.totalPrice = 35.0;
		
		System.out.println("Order Details");
		food.displayItems();
		System.out.println("Total Price:"+food.calculateTotalPrice((int)food.totalPrice));
		
		
	}

}
