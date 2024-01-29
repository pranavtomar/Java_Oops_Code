package DemoPackage;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber = 1635;
		int number = givenNumber;
		int num = number;
		int sum = 0;
		int count = 0;
		while(num > 0) {
			++count;
			num = num/10;
		}
		
		while(number > 0) {
			int rem = number % 10;
			sum = sum + (int)Math.pow(rem,count);
			number = number/10;
		}
		
		if(givenNumber == sum) {
			System.out.println("ArmstrongNumber");
		}else {
			System.out.println("Not ArmstrongNumber");
		}
		
		
		
	
	}

}
