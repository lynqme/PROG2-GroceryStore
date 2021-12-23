public class GroceryStore {

  
  public final static double TAX_RATE = 6.5;        // 6.5%
  public final static String STORE_NAME = "Best Grocery Store Ever";
  public final static int MAX_ITEM_NAME_SIZE = 25;
  public final static int COST_WIDTH = 6;
  
  public static String cents2dollarsAndCents(int tax) {
 
    String s = "";
     
    if (tax < 0) {
      s += "-";
      tax *= -1;
    }
    
    int dollars = tax/100;
    tax = tax % 100;
    
    if (dollars > 0)
      s += dollars;
    
    s +=".";
      
    if (tax < 10)
      s += "0";
      
    s += tax;
    return s;
  } 
}