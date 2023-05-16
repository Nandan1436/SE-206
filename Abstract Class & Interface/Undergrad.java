package StudentInfo;

public class Undergrad extends Student{

	public Undergrad(String name, int roll, boolean submitted) {
		super(name, roll, submitted);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void task() {
		System.out.println("Project completed by "+super.getName());
	}
	
}
