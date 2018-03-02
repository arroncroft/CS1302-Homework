package prob1;

public class Employee {
	
	private String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
}
