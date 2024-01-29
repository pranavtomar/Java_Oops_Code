package DemoPackage;

public class CountNumberOfChickensAndRabbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int legs = 11;
		int heads = 3;
		int rabbitLegs = 4;
		int chickenlegs = 2;
		int rabbitHead = 1;
		int chickenHead = 1;
		/*
		   rabbit*rabbitLegs+chicken*chickenLegs = legs
		   chicken*chickenHeads + rabbit*rabbitHeads = heads
		   After equating those equation we get,
		   	
		*/
		
		int rabbits = (legs - 2*heads)/2;
		int chickens = (4*heads-legs)/2;
		
		if(legs % 2 == 0) {
			System.out.println("Chickens="+chickens);
			System.out.println("Rabbits="+rabbits);
		}else {
			System.out.println("The number of chickens and rabbits cannot be found");
		}
		
	}

}
