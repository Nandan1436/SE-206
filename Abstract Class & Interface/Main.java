package StudentInfo;

public class Main {

	public static void main(String[] args) {
		Student u1 = new Undergrad("Nandan Bhowmick",1436,true);
		Student g1 = new Grad("Yasin Sazid", 1011,false);
		
		u1.suspend();
		g1.suspend();

	}

}
