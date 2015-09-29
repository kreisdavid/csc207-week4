
public abstract class Employee {

	private String name;
	protected int salary;
	private String id;
	private boolean employed;
	
	public Employee(String name, int salary, String id){
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.employed = true;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getidNum() {
		// TODO Auto-generated method stub
		return this.id;
	}


	public boolean isEmployed() {
		// TODO Auto-generated method stub
		return this.employed;
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	
	public void setEmployed(boolean employed){
		this.employed = employed;
	}
}
