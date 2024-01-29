package practiceproblem2;

public class CarRental extends VehicleRental{
	private String carType;
	
	public CarRental(Customer customer, int noOfKms, String carType) {
		super(customer, noOfKms);
		this.carType = carType;
	}
	
	//To_Trainee
	public double calculateFinalAmount() {
		double finalAmount = 0.0;
		int rentPerDay = CarDetails.identifyPerDayRent(this.carType);
		super.identifyJourneyDays();
		int excessKms = identifyJourneyDays();
		if(rentPerDay == -1 || excessKms < 0 || this.getJourneyDays() < 0) {
			finalAmount = -1.0;
			return finalAmount;
		}else {
			float rentalAmount = getJourneyDays() * rentPerDay;
			int excessKmsAmount = excessKms * 12;
			rentalAmount = rentalAmount + excessKmsAmount;
			float discountAmount = super.getCustomer().calculateDiscount(rentalAmount);
			if(discountAmount == -1.0f) {
				finalAmount = -1.0;
				return finalAmount;
			}else {
				finalAmount = rentalAmount - discountAmount;
				for(int i = 0; i < Customer.memberCustIdArr.length; i++) {
					if(super.getCustomer().getCustId().equals(Customer.memberCustIdArr[i])){
						Customer.memberBillAmountArr[i] = (int)(Customer.memberBillAmountArr[i]+finalAmount);
					}
				}
			}
		}
		return finalAmount;
	}	
}
