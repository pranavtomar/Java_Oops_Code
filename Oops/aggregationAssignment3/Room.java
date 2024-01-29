package aggregationAssignment3;

public class Room {
	private int roomNo;
	private int capacity;
	
	private static int roomCounter;
	static {
		roomCounter = 500;
	}

	public Room() {
		this.roomNo = roomCounter++;
		this.capacity = 4;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getRoomCounter() {
		return roomCounter;
	}

	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}

	public int getRoomNo() {
		return roomNo;
	}
	
	public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
	
}
