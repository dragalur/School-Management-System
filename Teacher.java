
public class Teacher {

	private int ID;
	private String name;
	private int salary;
	private int salaryEarned;
	
	Teacher(int id,String name,int salary){
		this.ID=id;
		this.name=name;
		this.salary=salary;
		salaryEarned=0;
	}

	public int getID() {
		return ID;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	public void  getSalary(int salary) {
		this.salary=salary;
	}
	
	public void receivedSalary(int salary) {
		salaryEarned+=salary;
		School.updateEarned(salary);
	}
	
	@Override
	public String toString() {
		return "Teacher name : "+name+" Total salary : "+salaryEarned;
	}	
		
}
