package entities;

public class Pension {

	private int numbOfRoom;

	private Student student;

	public Pension() {
	}

	public Pension(int numbOfRoom, Student student) {
		this.numbOfRoom = numbOfRoom;
		this.student = student;
	}

	public int getNumbOfRoom() {
		return numbOfRoom;
	}

	public void setNumbOfRoom(int numbOfRoom) {
		this.numbOfRoom = numbOfRoom;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Pension [numbOfRoom=" + numbOfRoom + ", student=" + student + "]";
	}

	
}
