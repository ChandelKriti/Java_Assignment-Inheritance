package Inheritance;

public class PublicTraining extends Training {

	private int participants;
	
	public PublicTraining (int id, String subject, int fees,int participants) {
		super(id,subject,fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	@Override
	public int getOrderValue() {
		return( getFees() * getParticipants());
	}
}
