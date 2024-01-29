package DemoPackage;

public class LoanAmountProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountNumber = 1001, accountBalance = 250000, salary = 40000, loanAmountExpected = 300000, emisExpected = 30;
		String loanType = "Car";
		if(accountNumber >= 1000 && accountNumber <= 1999) {
			if(accountBalance > 999) {
				if(loanAmountExpected <= 500000 && emisExpected <= 36 && loanType == "Car" && salary > 25000) {
					System.out.println("eligibleLoanAmount=500000");
					System.out.println("eligibleEmis=36");
				}else if(loanAmountExpected <= 6000000 && emisExpected <= 60 && loanType == "House" && salary > 50000){
					System.out.println("eligibleLoanAmount=6000000");
					System.out.println("eligibleEmis=60");
				}else if(loanAmountExpected <= 7500000 && emisExpected <= 84 && loanType == "Business" && salary > 75000) {
					System.out.println("eligibleLoanAmount=7500000");
					System.out.println("eligibleEmis=84");
				}
			}else {
				System.out.println("The customer should have a minimum balance of $1000 in the account");
			}
		}else {
			System.out.println("The account number should be of 4 digits and its first digit should be 1");
		}
	}

}
