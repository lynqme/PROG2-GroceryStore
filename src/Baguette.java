
public class Baguette extends Item {
	String name;
	int cost;
	
	public Baguette() {
		super();
	}

	public Baguette(String name, int cost) {
		super(name);
		this.name = name;
		this.cost = cost;
	}
	
	public int getCost(){
		return cost;
	}

}
