package Assignment_3;

public class Student extends Person{

	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	@Override
	public String getFullName() {
		return super.lastName+", "+super.firstName;
	}

}
