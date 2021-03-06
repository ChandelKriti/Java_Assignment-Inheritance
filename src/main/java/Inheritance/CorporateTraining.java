package Inheritance;

public class CorporateTraining extends Training{

private int days;
	
	public CorporateTraining (int id, String subject, int fees,int days) {
		super(id,subject,fees);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	@Override
	public int getOrderValue() {
		return getFees() * getDays();
	}
}
