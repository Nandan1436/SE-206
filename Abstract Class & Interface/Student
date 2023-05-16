package StudentInfo;

public abstract class Student implements Suspend{
	protected String name;
	protected int roll;
	protected boolean submitted;
	
	public Student(String name, int roll,boolean submitted) {
		super();
		this.name = name;
		this.roll = roll;
		this.submitted = submitted;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public abstract void task();
	
	@Override
	public void suspend() {
		if(submitted == true)task();
		else System.out.println(this.name+" has been suspended.");
	}
	
}
