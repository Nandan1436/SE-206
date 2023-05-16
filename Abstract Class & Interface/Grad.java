package StudentInfo;

public class Grad extends Student{

	public Grad(String name, int roll, boolean submitted) {
		super(name, roll, submitted);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void task() {
		System.out.println("Thesis completed by "+super.getName());
	}
	
}
