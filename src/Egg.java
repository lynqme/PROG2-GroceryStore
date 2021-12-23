
public class Egg extends Item {
	int eggQty;
	int pricePerDozen;
	String name;
	
	public Egg() {
		super();
	}
	public Egg(int eggQty, int pricePerDozen) {
		super();
		this.name=name;
		this.eggQty = eggQty;
		this.pricePerDozen = pricePerDozen;
	}
	public Egg(String name, int eggQty, int pricePerDozen) {
		super(name);
		this.eggQty = eggQty;
		this.pricePerDozen = pricePerDozen;
	}

	
	public int getEggQty() {
		return eggQty;
	}

	public void setEggQty(int eggQty) {
		this.eggQty = eggQty;
	}

	public int getPricePerDozen() {
		return pricePerDozen;
	}

	public void setPricePerDozen(int pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}

	
	public int getCost() {
		int cost = eggQty*(pricePerDozen/12);
		return cost;
	}

}
