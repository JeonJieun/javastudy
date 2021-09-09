package prob04;

public class Depart extends Employee{
	private String department;
	
	Depart(String name, int salary, String department){
		setName(name);
		setDepartment(department);
		setSalary(salary);
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void getInformation() {
		System.out.println( "이름:" + getName() + "\t연봉:" + getSalary() + "\t부서:" + getDepartment());
	}
}
