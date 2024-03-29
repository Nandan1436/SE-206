package Assignment_3;
import java.util.ArrayList;

public class University {
	private ArrayList<Person>persons;

	public University(ArrayList<Person> persons) {
		super();
		this.persons = persons;
	}
	
	public void getFullNames() {
		for(int i=0;i<persons.size();i++) {
			System.out.print(persons.get(i).firstName+" "+persons.get(i).lastName);
			if(i!=persons.size()-1)System.out.print(", ");;
		}
		System.out.println();
	}
	
	public Person getYoungestPerson() {
		Person smallest = new Person(persons.get(0).firstName,persons.get(0).lastName,persons.get(0).age);
		
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getAge()<smallest.getAge())smallest=persons.get(i);
		}
		return smallest;
	}
	
	public Person getOldestPerson() {
		Person oldest = new Person(null,null,0);
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getAge() > oldest.getAge())oldest=persons.get(i);
		}
		return oldest;
	}
	
	public ArrayList<Person> getVoters() {
		ArrayList<Person>canVote=new ArrayList<Person>();
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).canVote())canVote.add(persons.get(i));
		}
		return canVote;
	}
	
	public int getNumberOfEmployees() {
		int count=0;
		for(Person p : persons) {
			if(p.getFullName().contains("Employee"))count++;
		}
		return count;
	}
	
}
