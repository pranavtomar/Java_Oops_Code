package accessingPrivateVari;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();

		// Creating object of Customer class
		customer.setCustomerId("C101");

		// Setting values of the instance variables using setter methods
		customer.setCustomerName("Jack");
		customer.setContactNumber(9870345687L);
		customer.setAddress("D089, St. Louis Street, Springfield");

		System.out.println("Displaying Customer Details");
		// Displaying values of the instance variables using getter methods
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("Contact Number : " + customer.getContactNumber());
		System.out.println("Address : " + customer.getAddress());
	}

}
