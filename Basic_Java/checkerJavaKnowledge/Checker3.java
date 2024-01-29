package checkerJavaKnowledge;

class A{
	public int count;
	
	public A() {
		count = 10;
	}
	
	public int method1() {
		int count = 20;
		return this.count;
	}
}

class B extends A{
	public int method1() {
		return this.count = 15;
	}
	public int method2() {
		return 20;
	}
}

class C extends B{
	public int method2() {
		return 40;
	}
}

public class Checker3 {
	
	public static int demo(int x, int y) {
		if(x == 0) {
			return 1;
		}else if(y>x) {
			return 0;
		}else {
			return(y+demo(x-1,y+1));
		}
	}

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int i  = 2; i < 8; i+=2) {
//			for(int j = 8; j > i; j -= 2) {
//				if(i >= j/2) {
//					continue;
//				}else {
//					sum += i + j;
//				}
//			}
//		}
//		System.out.println("Sum = "+ sum);
		
//		System.out.println(demo(5,1));
		
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
		System.out.println(obj1.method1()+obj3.method1()+obj3.method2());
		
	}

}
