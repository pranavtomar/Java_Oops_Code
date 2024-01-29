package DemoPackage;

public class numberDivisibleByItsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber = 123;
		int number = givenNumber;
		int sum = 0;
		while(number > 0) {
			int remainder = number % 2;
			sum += remainder; 
			number /= 10;
		}
		if(givenNumber % sum == 0) {
			System.out.println(givenNumber+" is divisible by sum of its digits");
		}else {
			System.out.println(givenNumber+" is not divisible by sum of its digits");
		}
	}

}
