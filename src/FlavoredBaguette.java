
public class FlavoredBaguette extends Baguette {

	String name;
	int cost;
	String flavor;
	int flavorCost;

	public FlavoredBaguette() {
		super();
	}
	public FlavoredBaguette(String name, int cost, String flavor, int flavorCost) {
		super(name, cost);
		this.name = name;
		this.cost = cost;
		this.flavor = flavor;
		this.flavorCost = flavorCost;
	}
	
	public int getCost() {
		return cost + flavorCost;
	}
}