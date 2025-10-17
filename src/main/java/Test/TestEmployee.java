package Test;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		emp.setName("Abhishek");
		System.out.println(emp.getName());
		emp.setId(20);
		System.out.println(emp.getId());
		emp.setSalary(30000.00);
		System.out.println(emp.getSalary());

	}

}
