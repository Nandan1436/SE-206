package Assignment_3;

public class Person {
	protected String firstName;
	protected String lastName;
	protected int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public boolean canVote() {
		if(this.age>=18)return true;
		else return false;
	}
	
}
