package ch01;

public class ShoppingBag {
	protected int theNumItems;
	protected float theTotalRetailCost;
	protected float theTaxRate;
	protected int addItems;
	protected float itemCost;
	protected float theTotalTaxCost;

	/**
	 * Creates a Shopping Bag by entering the number of items in it
	 * the total costs of those items, and the tax rate to be applied for the total cost
	 * 
	 * @param numItems
	 * @param totalCost
	 * @param taxRate
	 */
	public ShoppingBag(int numItems, float totalCost, float taxRate){
		theNumItems = numItems;
		theTotalRetailCost = totalCost;
		theTaxRate = taxRate;
		theTotalTaxCost = (theTotalRetailCost * theTaxRate) + theTotalRetailCost;
	}
	
	/**
	 * Adds a number of items to the shopping bag, at a price given
	 * 
	 * @param addItems
	 * @param itemCost
	 */
	public void place(int addItems, float itemCost){
		theNumItems += addItems;
		theTotalRetailCost += addItems * itemCost;
		
	}
	
	public int getNumItems(){
		return theNumItems;
	}
	
	public float getTotalRetail(){
		return theTotalRetailCost;
	}
	
	public float getTotalTaxCost(){
		
		return theTotalTaxCost;
	}
	
	public String toString(){
		return("You have " + theNumItems + " in your shopping bag for a Retail Cost of " + 
				theTotalRetailCost + " and a Total Cost with tax " + theTotalTaxCost );
		
	}
}
