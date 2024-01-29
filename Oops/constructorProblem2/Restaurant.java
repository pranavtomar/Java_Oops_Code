package constructorProblem2;

public class Restaurant {
	String name;
	long restaurantContact;
	String restaurantAddress;
	float rating;
	
	Restaurant(String name, long restaurantContact,
			String restaurantAddress, float rating){
		this.name = name;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}
	
	public void displayRestaurantDetails(){
		System.out.println("Restaurant Name : "+name);
		System.out.println("Restaurant Rating : "+rating);
		System.out.println("Restaurant Contact : "+restaurantContact);
		System.out.println("Restaurant Address : "+restaurantAddress);
	}
	
}
