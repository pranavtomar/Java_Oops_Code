package DemoPackage;

public class CheckPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 46763;
		int number = inputNumber;
		int palindrome = 0;
		while(number>0) {
			int reminder = number%10;
			palindrome = palindrome*10 + reminder;
			number /= 10;
		}
		if(palindrome == inputNumber) {
			System.out.println(inputNumber+" is a palindrome");
		}else {
			System.out.println(inputNumber+" is not palindrome");
		}
	}

}
