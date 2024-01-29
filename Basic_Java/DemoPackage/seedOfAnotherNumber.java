package DemoPackage;

public class seedOfAnotherNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne = 45;
		int numberTwo = 1000;
		int seedOfNumOne = numberOne;
		int number = numberOne;
		while(numberOne > 0) {
			int rem = numberOne % 10;
			seedOfNumOne *=  rem;
			numberOne /= 10;
		}
		
		if(seedOfNumOne == numberTwo) {
			System.out.println(number+" is a seed of "+numberTwo);
		}else {
			System.out.println(number+" is not a seed of "+numberTwo);
		}
	}

}
