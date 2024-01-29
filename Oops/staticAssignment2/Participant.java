package staticAssignment2;

public class Participant {
	
	private static int counter;
	static {
		counter = 0;
	}
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	
	public String getRegistrationId() {
		return registrationId;
	}

//	public void setRegistrationId(String registrationId) {
//		this.registrationId = registrationId;
//	}
	
	public Participant(String name, long contactNumber, String city) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		
		registrationId = "D1000"+(++counter);
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Participant.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
