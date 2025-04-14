package Practise;

public class EmployeeSalary {
	private String name;
	private String dep;
	private int salary;
	
	public EmployeeSalary(String name, String dep, int salary) {
		super();
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeSalary [name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
}
