package exp;

import java.util.Date;

public class ExpClassWithFieldsTwo {
	
	private Integer bonafide = null;
	private String xxx = null;
	private Date dateField = null;

	public ExpClassWithFieldsTwo(int i) {
		bonafide = i;
	}
	
	public ExpClassWithFieldsTwo(int i, String x, Date d) {
		bonafide = i;
		xxx = x;
		dateField = d;
	}

	
	public ExpClassWithFieldsTwo() {
		// TODO Auto-generated constructor stub
	}


	public Integer getBonafide() {
		return bonafide;
	}

	public void setBonafide(Integer bonafide) {
		this.bonafide = bonafide;
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

	public Date getDateField() {
		return dateField;
	}

	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}

}
