package Problem1;

public class SwiftFood {
	int orderedId;
	String orderFoods;
	double totalPrice;
	String status;
	
	double calculateTotalPrice(int unitPrice) {
		double totalPrice = unitPrice + unitPrice*5.0/100.0;
		return totalPrice;
	}
	
	void displayItems(){
		System.out.println("Order Id: "+orderedId);
		System.out.println("Orderedfood: "+orderFoods);
		System.out.println("Order Status: "+status);
	}
}
