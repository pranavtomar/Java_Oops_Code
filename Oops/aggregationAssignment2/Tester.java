package aggregationAssignment2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Joshua Bloch","joshua@email.com",'M');
		Book book = new Book("Effective Java", author, 45, 15);
		System.out.println("Displaying author Details");
		System.out.println("Author name: "+author.getName());
		System.out.println("Author email: "+author.getEmailId());
		System.out.println("Author gender: "+author.getGender());
	}

}
