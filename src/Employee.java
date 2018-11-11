public class Employee {
	private String name;
	private double salary;
	private int age;
	private String designation;

	public void setname(String name) {
		this.name = name;
	}

	public void setsalary(double salary) {
		this.salary = salary+100;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public String getname() {
		return name;
	}

	public double getsalary() {
		return salary;
	}

	public int getage() {
		return age;
	}

	public int test() {
		return 5;
	}
	public String getdesignation() {
		return designation;
	}

	public int paybonus(double salary) {
		if (salary < 5000) {
			return 100;
		}
		return 0;
	}
//test
	public static void main(String args[]) {
		// creating a object
		Employee empObj1 = new Employee();

		empObj1.setname("Jasmine");
		empObj1.setsalary(6000);
		empObj1.setage(24);
		empObj1.setdesignation("QA Analyst");

		System.out.println("Hello " + empObj1.getname());
		System.out.println(empObj1.getsalary());
		System.out.println(empObj1.getage());
		System.out.println(empObj1.getdesignation());
		System.out.println(empObj1.paybonus(empObj1.getsalary()));
		

	}

}
