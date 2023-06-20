package emp_sort;

public class Emp {
	private int empno;
	private String name;
	private double salary;
	
	public Emp() {
		super();
		this.empno = 0;
		this.name = "";
		this.salary = 0;

		
	}

	public Emp(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
