package classAndObjects;

public class Customer {

	public int customerId;
	public String customerName;
	public long customerContactNo;
	public String customerAddress;
	
	public void displayCustomerDetails() {
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContactNo);
		System.out.println(customerAddress);
	}
	
	public void setCustomerName(String custName) {
		customerName = custName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
}
