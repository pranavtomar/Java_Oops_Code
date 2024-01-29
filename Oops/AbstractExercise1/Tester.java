package AbstractExercise1;

abstract class Student{
	
	private String studentName;
	private int[] testScore;
	private String testResult;
	
	public void setTestScore(int testNumber ,int testScore) {
		this.testScore[testNumber] = testScore;
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.testScore = new int[4];
		this.testResult = "";
	}
	
	abstract public void gerenrateResult();

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScore() {
		return testScore;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
}

class UndergraduateStudent extends Student{

	public UndergraduateStudent(String studentName) {
		super(studentName);
	}

	@Override
	public void gerenrateResult() {
		int sum = 0;
		for(int i = 0; i < this.getTestScore().length; i++) {
			sum = sum + this.getTestScore()[i];
		}
		if((sum/4.0)>=60) {
			this.setTestResult("Pass");
		}else {
			this.setTestResult("Fail");
		}
	}
	
}

class GraduateStudent extends Student{

	public GraduateStudent(String studentName) {
		super(studentName);
	}

	@Override
	public void gerenrateResult() {
		int sum = 0;
		for(int i = 0; i < this.getTestScore().length; i++) {
			sum = sum + this.getTestScore()[i];
		}
		if((sum/4.0)>=70) {
			this.setTestResult("Pass");
		}else {
			this.setTestResult("Fail");
		}
	}
    
}


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.gerenrateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.gerenrateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
	}

}
