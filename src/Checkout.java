import java.util.*;
public class Checkout {
	
	int totalCost;
	int tax;

	GroceryStore store = new GroceryStore();
	ArrayList<Item> groceryList = new ArrayList<Item>();
	
	public void enterItem(Baguette item){
		groceryList.add(item);
	}
	public void enterItem(Egg item) {
		groceryList.add(item);
	}
	public void enterItem(Rice item) {
		groceryList.add(item);
	}
	public void enterItem(FlavoredBaguette item) {
		groceryList.add(item);
	}
	public int numberOfItems() {
		return groceryList.size();
	}
	public String totalCost() {
		totalCost = 0;
		for(int temp=0; temp<groceryList.size(); temp++) {
			totalCost = totalCost + groceryList.get(temp).getCost();
		}
		String dollarAmt = store.cents2dollarsAndCents(totalCost);
		return dollarAmt;
	}
	public String totalTax() {
		tax = (int)Math.round(totalCost * (store.TAX_RATE /100));
		return store.cents2dollarsAndCents(tax);
	}
	public String totalAmt() {
		int total = tax+totalCost;
		return store.cents2dollarsAndCents(total);
	}
	/*
	public String displayTotalWithTax() {
		int total = totalCost * (int)Math.round(store.TAX_RATE);
		return store.cents2dollarsAndCents(total);
	}*/
	public void clear() {
		groceryList.clear();
		
	}
	
	public String toString() {
	System.out.println("     Best Grocery Store Ever");	
	System.out.println("     -----------------------");	
		StringBuilder receipt = new StringBuilder();
		for(int temp=0; temp<groceryList.size();temp++) {
			//String s =  (groceryList.get(temp).name + "%63s") + groceryList.get(temp).getCost();
			  receipt.append(groceryList.get(temp).name +"                   ");
			  receipt.append(store.cents2dollarsAndCents(groceryList.get(temp).getCost()) + "\n");
}
		
		return receipt.toString() + "\n" + "Tax							" + totalTax() + "\n" +"Total Cost					"  +totalAmt();
		}

}
