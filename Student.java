
public class Student {

	private int ID;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	Student(int id,String name , int grade){
		this.ID=id;
		this.name=name;
		this.grade=grade;
		feesPaid=0;
		feesTotal=20000;
	}
	
	public void payFees(int pay) {
		feesPaid+=pay;
		School.updateSpent(pay);
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesTotal() {
		return feesTotal-feesPaid;
	}

	public int getFeesPaid() {
		return feesPaid;
	}
		
	@Override
	public String toString() {
		return "Student name : "+name+" Total fees paid : "+feesPaid;
	}	
}
