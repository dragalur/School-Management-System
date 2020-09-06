import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int moneyEarned;
	private static int moneySpend;
	
	School(List<Teacher> teacher,List<Student> student){
		this.teachers=teacher;
		this.students=student;
		moneyEarned=0;
		moneySpend=0;
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public List<Teacher> getTeacher(){
		return teachers;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public List<Student> getStudent(){
		return students;
	}

	public int getMoneySpend() {
		return moneySpend;
	}
	
	public static void updateSpent(int spents) {
		moneySpend-=spents;
	}
	
	public static void updateEarned(int earned) {
		moneySpend+=earned;
	}
	
}
