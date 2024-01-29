package DemoPackage;

public class SelectionControlStructure2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:



Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.

		 */
		char foodType = 'V';
		int quantityOrder = 1;
	    int distance = 7;
	    if(quantityOrder > 0 && foodType == 'N'){
	           int foodPrice = 15;
		       if(distance >= 0 && distance <= 3){
		          int deliveryCharge = 0;
		          System.out.println(quantityOrder*foodPrice+0);
		       }else if(distance >= 4 && distance <= 6){
		            int deliveryCharge = 1;
		            System.out.println(quantityOrder*foodPrice+1);
		       }else if(distance >= 7){
		            int deliveryCharge = 5;
		            System.out.println(quantityOrder*foodPrice+2);
		       }else{
		            System.out.println("-1");
		       }
		}else if(quantityOrder > 0 && foodType == 'V'){
	           int foodPrice = 12;
		       if(distance >= 0 && distance <= 3){
		          int deliveryCharge = 0;
		          System.out.println(quantityOrder*foodPrice+0*distance);
		       }else if(distance >= 4 && distance <= 6){
		            int deliveryCharge = 1;
		            System.out.println(quantityOrder*foodPrice+1*(distance-3));
		       }else if(distance >= 7){
		            int deliveryCharge = 5;
		            System.out.println(quantityOrder*foodPrice+3+2*(distance-6));
		       }else{
		            System.out.println("-1");
		       }
		}
		else{
		      System.out.println("-1");
		}
	}
}
