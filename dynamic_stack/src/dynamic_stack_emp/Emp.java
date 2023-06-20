package dynamic_stack_emp;

public class Emp {
	private int empId;
	private int age;
	private String name;
	public Emp() {
		super();
		this.empId = 0;
		this.age = 0;
		this.name = "";
	}
	public Emp(int empId, int age, String name) {
		super();
		this.empId = empId;
		this.age = age;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
}
