package Assignment_3;

public class Employee extends Person{

	public Employee(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		}
		@Override
		public String getFullName() {
			return super.firstName+" "+super.lastName+"(Employee)";
		}
	
}
