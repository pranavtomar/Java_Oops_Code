package finalkeyword;

class Student{
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
	
	public double calculateTotalStipend() {
		double bonus = 0.0;
		if(this.aggregateMarks >= 85 && this.aggregateMarks<90) {
			bonus = 10;
		}else if(this.aggregateMarks >= 90 && this.aggregateMarks<95) {
			bonus = 15;
		}else if(this.aggregateMarks >= 95 && this.aggregateMarks<=100) {
			bonus = 20;
		}else {
			bonus = 0.0;
		}
		
		return this.STIPEND+bonus;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}
	
	
}

public class FinalExercise1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}
