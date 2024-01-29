package DemoPackage;

public class NoteProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int notes1$Available = 3, notes5$Available = 3;
//		int purchaseAmount = 21;
//		int totalAmount = 1*notes1$Available + notes5$Available*5;
//		int remainingAmount = purchaseAmount%5;
//		if(totalAmount < purchaseAmount) {
//			System.out.println("-1");
//		}else if(remainingAmount <= notes1$Available){
//			System.out.println("$1 notes needeed = "+remainingAmount);
//			System.out.println("$5 notes needed = "+purchaseAmount/5);
//		}else {
//			System.out.println("-1");
//		}
		
		int number = 11;
		if(number%3==0 && number%5==0) {
			System.out.println("Zoom");
		}else if(number%3==0) {
			System.out.println("Zip");
		}else if(number%5==0) {
			System.out.println("Zap");
		}else {
			System.out.println("invalid");
		}
		
	}
}
