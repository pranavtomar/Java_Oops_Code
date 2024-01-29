package DemoPackage;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber = 16234;
		int number = givenNumber;
		int count = 0;
		int num = number;
		int sum = 0;
		while(number > 0) {
			number /= 10;
			count++;
		}
		if(count%2==0) {
			while(num > 0) {
				int rem = num % 10;
				sum += rem*rem;
				num /= 100;
			}
		}else {
			num /= 10;
			while(num > 0) {
				int rem = num % 10;
				sum += rem*rem;
				num /= 100;
			}
		}
		
		if(sum % 9 == 0) {
			System.out.println("The number "+givenNumber+" is a lucky number");
		}else {
			System.out.println("The number is not a lucky number");
		}
	}

}
