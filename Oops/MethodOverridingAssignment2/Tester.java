package MethodOverridingAssignment2;

class Event{
    //Implement your code here
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	public Event(String eventName, String participantName) {
		this.eventName = eventName;
		this.participantName = participantName;
	}
	
	public void registerEvent() {
		if(this.eventName.equalsIgnoreCase("Singing")) {
			this.registrationFee = 8.0;
		}else if(this.eventName.equalsIgnoreCase("Dancing")) {
			this.registrationFee = 10.0;
		}else if(this.eventName.equalsIgnoreCase("DigitalArt")) {
			this.registrationFee = 12.0;
		}else if(this.eventName.equalsIgnoreCase("Acting")) {
			this.registrationFee = 15.0;
		}else {
			this.registrationFee = 0.0;
		}
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
}

class SoloEvent extends Event{
	private int participantNo;

	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName, participantName);
		this.participantNo = participantNo;
	}
	
	public void registerEvent() {
		super.registerEvent();
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
}

class TeamEvent extends Event{
    private int noOfParticipants;
    private int teamNo;
    
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public int getNoOfParticipant() {
		return noOfParticipants;
	}
	public void setNoOfParticipant(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
    
	public void registerEvent() {
		if(this.getEventName().equalsIgnoreCase("Singing")) {
			this.setRegistrationFee(this.noOfParticipants*4);
		}else if(this.getEventName().equalsIgnoreCase("Dancing")) {
			this.setRegistrationFee(this.noOfParticipants*6);
		}else if(this.getEventName().equalsIgnoreCase("DigitalArt")) {
			this.setRegistrationFee(this.noOfParticipants*8);
		}else if(this.getEventName().equalsIgnoreCase("Acting")) {
			this.setRegistrationFee(this.noOfParticipants*10);
		}else {
			this.setRegistrationFee(0.0);
		}
	}
	
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
			soloEvent.registerEvent();
			if (soloEvent.getRegistrationFee() != 0) {
				System.out.println("Thank You " + soloEvent.getParticipantName()
						+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
				System.out.println("Your participant number is " + soloEvent.getParticipantNo());

			} else {
				System.out.println("Please enter a valid event");
			}

			System.out.println();
			TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
			teamEvent.registerEvent();
			if (teamEvent.getRegistrationFee() != 0) {
				System.out.println("Thank You " + teamEvent.getParticipantName()
						+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
				System.out.println("Your team number is " + teamEvent.getTeamNo());
			} else {
				System.out.println("Please enter a valid event");
			}
	}

}
