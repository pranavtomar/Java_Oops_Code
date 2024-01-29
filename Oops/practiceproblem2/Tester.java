package practiceproblem2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer custObj = new Customer("1051R","Wilch");
		
		CarRental carRentalObj = new CarRental(custObj,10,"SUV");
		for (int ind=0; ind<Customer.memberCustIdArr.length; ind++) {
			System.out.print(Customer.memberCustIdArr[ind]+":"+Customer.memberBillAmountArr[ind]+" ");
		}
		
		System.out.println();
		
		double finalAmount = carRentalObj.calculateFinalAmount();
		System.out.println("Final bill amount: "+finalAmount);
		for (int ind=0; ind<Customer.memberCustIdArr.length; ind++) {
			System.out.print(Customer.memberCustIdArr[ind]+":"+Customer.memberBillAmountArr[ind]+" ");
		}
	}

}
