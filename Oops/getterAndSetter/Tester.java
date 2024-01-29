package getterAndSetter;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
//		customer.customerId = "C101";
//		customer.customerName = "Jack";
//		customer.contactNumber = 9870345687L;
//		customer.address = "D089, St. Louis Street, Springfield";
		
		customer.setCustomerId("C101");
		customer.getCustomerId();
		
		customer.setCustomerName("Jack");
		customer.getCustomerName();
		
		customer.setContactNumber(9870345687L);
		customer.getContactNumber();
		
		customer.setAddress("D089, St. Louis Street, Springfield");
		customer.getAddress();
		
		System.out.println("Displaying customer details");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("Contact Number : " + customer.getContactNumber());
		System.out.println("Address : " + customer.getAddress());
	}

}
