package someAdditionalConcept;

public class Tester1 {

	public static void main(String[] args) {
		
		int a = 60/2;
		
		try {
			System.out.println("Infosys");
			System.out.println(a);
			throw new Error();
		}catch(Exception e){
			System.out.println("In catch block");
		}finally{
			System.out.println("In finally block");
		}
		System.out.println("In main method");
	}

}
