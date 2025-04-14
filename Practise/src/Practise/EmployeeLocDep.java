package Practise;

public class EmployeeLocDep {
	private String name;
	private int age;
	private String gender;
	private String dep;
	
	public EmployeeLocDep(String name, int age, String gender, String dep) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dep = dep;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "EmployeeLocDep [name=" + name + ", age=" + age + ", gender=" + gender + ", dep=" + dep + "]";
	}
	
	
}
