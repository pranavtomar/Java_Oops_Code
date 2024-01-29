package staticAssignment1;

public class Order {
	
	private static int totalNoOfOrder;
	private static int orderIdCounter;
	static {
		orderIdCounter = 0;
	}
	private int orderId;
	private Food[] orderedFoods;
	
	public static int getTotalNoOfOrder() {
		return ++totalNoOfOrder;
	}
	
	public Order() {
		this.orderedFoods = orderedFoods;
	}
	
	public Order(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
		this.orderId = 100 + (++Order.orderIdCounter);
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static int getOrderIdCounter() {
		return orderIdCounter;
	}

	private double totalPrice;
	private String status;
	
	
	
}
