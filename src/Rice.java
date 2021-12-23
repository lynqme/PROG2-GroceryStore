
public class Rice extends Item {
	double weight;
	double pricePerPound;
	String name;
	
	// three constructors: first with no parameters, second with weight and price per pound,
	// and third has a name, weight, and price per pound.
	public Rice() {
		super();
	}
	public Rice(String name, double weight, int pricePerPound) {
		super(name);
		this.name=name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	
	//getters & setters
	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(int pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	//override getCost() from Item
	public int getCost() {
			double cost = this.pricePerPound*this.weight;
			return (int) Math.round(cost);
			
	}
}