package Assignment_3;
import java.util.ArrayList;

public class UniversityTest {

	public static void main(String[] args) {
		ArrayList<Person>person = new ArrayList<>();
		
		Person s1 = new Student("Nandan","Bhowmick",19);
		Person s2 = new Student("Ismail","Hossain",17);
		Person s3 = new Student("Mahfuz","Ayon",20);
		
		Person e1 = new Employee("Harry","Maguire",35);
		Person e2 = new Employee("Steve","Cooper",29);
		Person e3 = new Employee("Howard","Wolowitz",31);
		Person e4 = new Employee("Joey","Tribiani",34);
		
		person.add(s1);
		person.add(s2);
		person.add(s3);
		person.add(e1);
		person.add(e2);
		person.add(e3);
		person.add(e4);
		
		University uni = new University(person);
		
		System.out.println("Name of all the persons in the university: ");
		uni.getFullNames();
		System.out.println();
		
		Person youngest=uni.getYoungestPerson();
		System.out.println("Name of the youngest person: "+youngest.getFullName());
		System.out.println();
		
		Person oldest = uni.getOldestPerson();
		System.out.println("Name of the oldest person: "+oldest.getFullName());
		System.out.println();
		
		ArrayList<Person>canVote = uni.getVoters();
		System.out.println("People who can vote: ");
		for(Person x : canVote) {
			System.out.println(x.getFullName());
		}
		System.out.println();
		
		int num = uni.getNumberOfEmployees();
		System.out.println("Number of employees in the university: "+num);
		
	}

}
