package methodoverloadingassignment1;

class Bill{
    //Implement your code here
	public double findPrice(int itemId) {
		double price = 0.0;
		if(itemId == 1001) {
			price = 25;
		}
		else if(itemId == 1002) {
			price = 20;
		}
		else if(itemId == 1003) {
			price = 23;
		}
		else if(itemId == 1004) {
			price = 18;
		}else {
			price = 0;
		}
		return price;
	}
	public double findPrice(String brandName, String itemType, int size) {
		double price = 0;
		if(brandName == "Puma") {
			if((itemType.equals("T-shirt") && size == 34) || (itemType.equals("T-shirt") && size == 36)) {
				price = 25;
			}else if((itemType.equals("Skirt") && size == 38) || (itemType.equals("Skirt") && size == 40)) {
				price = 20;
			}else {
				price = 0;
			}
		}else if(brandName == "Reebok"){
			if(itemType.equals("T-shirt") && size == 34 || itemType.equals("T-shirt") && size == 36) {
				price = 23;
			}else if((itemType.equals("Skirt") && size == 38) || (itemType.equals("Skirt") && itemType == "Skirt" && size == 40)) {
				price = 18;
			}else {
				price = 0;
			}
		}else {
			price = 0;
		}
		return price;
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}

}
