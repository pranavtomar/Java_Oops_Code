package interfaceproblem;

interface Tax{
    //Implement your code here
	abstract double calculateTax(double price);
}

class PurchaseDetails implements Tax{
    //Implement your code here
	private String puchaseId;
	private String paymentType;
	private double taxPercentage;
	
	public PurchaseDetails(String puchaseId, String paymentType) {
		this.puchaseId = puchaseId;
		this.paymentType = paymentType;
	}

	public String getPuchaseId() {
		return puchaseId;
	}

	public void setPuchaseId(String puchaseId) {
		this.puchaseId = puchaseId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public double calculateTax(double price) {
		if(this.paymentType.equalsIgnoreCase("Debit Card")) {
			this.taxPercentage = 2;
		}else if(this.paymentType.equalsIgnoreCase("Credit Card")) {
			this.taxPercentage = 3;
		}else {
			this.taxPercentage = 4;
		}
		
		return price+(this.taxPercentage/100.0)*price; //price+(tax on price)
	}
	
}

class Seller implements Tax{
	
	private String location;
	private double taxPercentage;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Seller(String location) {
		super();
		this.location = location;
	}
	
	public double calculateTax(double price) {
		if(this.location.equalsIgnoreCase("Middle east")) {
			this.taxPercentage = 15;
		}else if(this.location.equalsIgnoreCase("Europe")) {
			this.taxPercentage = 25;
		}else if(this.location.equalsIgnoreCase("Canada")) {
			this.taxPercentage = 22;
		}else if(this.location.equalsIgnoreCase("Japan")) {
			this.taxPercentage = 12;
		}
		return (this.taxPercentage/100.0)*price;
	}
	
}

public class InterfaceExercise1 {

	public static void main(String[] args) {
		
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
		
	}

}
