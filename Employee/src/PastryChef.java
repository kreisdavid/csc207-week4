
public class PastryChef extends Cook{

	private int frostingTime;
	
	public PastryChef(String name, int salary, String id) {
		super(name, salary, id);
		frostingTime = 0;
	}

	@Override
	public void cook(){
		System.out.println("Bake Bake Bake");
	}
	
	public void frost(){
		frostingTime++;
	}
	
	public static void main(String[] args){
		PastryChef p = new PastryChef("Jane", 1000000, "eianei");
		Cook c = new Cook("Bob", 324234, "wnefwoa");
		c.cook();
		p.cook();
	}
	
}
