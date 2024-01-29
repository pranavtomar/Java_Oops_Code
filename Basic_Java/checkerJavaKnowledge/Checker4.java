package checkerJavaKnowledge;

class Address{
	private int zipCode;
	
	public Address(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public int getZipCode() {
		return zipCode;
	}
}

class Customer1{
	public Address address;
	public String name;
	
	public Customer1(String name, int zipCode) {
		this.name = name;
		address = new Address(zipCode);
	}
}

public class Checker4 {

	public static void main(String[] args) {
		Customer1 customer = new Customer1("Sam",100001);
		System.out.println(customer.address.getZipCode());
	}

}
