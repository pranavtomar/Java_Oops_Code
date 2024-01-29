package getterAndSetter;

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;

	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
}
