package staticproblem;

public class Bill {
	
	private static int counter;
	static {
		counter = 0;
	}
	private String billId;
	private String paymentMode;
	
	public Bill(String paymentMode) { //constructor
		this.billId = "B"+(++counter);
		this.paymentMode = paymentMode;
	}
	
	public String getBillId() {
		return this.billId;
	}
	
	public String getPaymentMode() {
		return paymentMode;
	}
	
	public static int getCounter() {
		return Bill.counter;
	}
	
	public void setBillId(String billId) {
		this.billId = billId;
	}
	
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
