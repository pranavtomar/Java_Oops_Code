package constructorProblem1;

public class Order {
	
	public int orderId;
	public String orderedFoods;
	public String status;
	public Order(){
		status = "Ordered";
	}
	
	public Order(int orderId, String orderedFoods) {
		status = "Ordered";
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
	}
}
