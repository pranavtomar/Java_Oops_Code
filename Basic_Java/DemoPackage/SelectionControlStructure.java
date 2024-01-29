package DemoPackage;

public class SelectionControlStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 6, c = 7;
		if(a == 7){
		   System.out.println(b*c);
		}else if(b == 7){
		   System.out.println(c);
		}else if(c == 7){
		   System.out.println("-1");
		}else{
		   System.out.println(a*b*c);
		}
	}
}
