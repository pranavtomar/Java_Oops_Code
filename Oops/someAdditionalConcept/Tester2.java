package someAdditionalConcept;

abstract class Employee{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

class SystemEngineer extends Employee{
	
	public SystemEngineer(String name) {
		super(name);
	}
	
}

public class Tester2 {

	public static void main(String[] args) {
		
		Employee systemEngineer = new SystemEngineer("Maria");
		System.out.println(systemEngineer.getName());
	}

}
