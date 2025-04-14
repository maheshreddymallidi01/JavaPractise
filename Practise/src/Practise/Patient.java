package Practise;

public class Patient {
	private String name;
	private int age;
	private String disease;
	private int bllPaid;
	
	public Patient(String name, int age, String disease, int bllPaid) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bllPaid = bllPaid;
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getBllPaid() {
		return bllPaid;
	}
	public void setBllPaid(int bllPaid) {
		this.bllPaid = bllPaid;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", bllPaid=" + bllPaid + "]";
	}
	
	
}
