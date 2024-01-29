package classAndObjects;

public class Tester {

	public static void main(String[] args) {
		
		Customer pranav = new Customer();
		Customer saurabh = new Customer();
		
		pranav.customerId = 1001;
		saurabh.customerId = 1002;
		pranav.customerName = "Kunal";
		pranav.customerContactNo = 9170983678L;
		pranav.customerAddress = "Tikara Samad, Bachhauli, Auras, Unnao, 209870";
		
		pranav.displayCustomerDetails();
		
		System.out.println(pranav.customerId);
		System.out.println(saurabh.customerId);
		
		pranav.setCustomerName("Thakur");
		System.out.println(pranav.getCustomerName());
	}

}
