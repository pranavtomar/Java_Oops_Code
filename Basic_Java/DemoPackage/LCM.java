package DemoPackage;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 11;
		int max = 0;
		int min = 0;
		int lcm = 0;
		int x = 0;
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i = 1; i <= min; i++) {
			x = max*i;
			if(x%min==0) {
				lcm = x;
				break;
			}
		}
		
		System.out.println(lcm);
	}

}
