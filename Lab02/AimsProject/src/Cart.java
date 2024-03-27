
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[]= 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	// check how many DVD in the cart
	public int qtyOrdered() {
		int cnt = 0;
		for (DigitalVideoDisc item : itemsOrdered) {
			if (item == null) {
				continue;
			}
			else {
				cnt +=1 ;
			}
		}
		return cnt;
	}
	
	// add an item into the cart (return added disc)
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		int check = qtyOrdered();
		if (check == 20) {
			System.out.println("The cart is already full, can not add more DVD into the cart");
			return;
		}
		else { 
			itemsOrdered[check] = disc;
			System.out.println("This disc has been added");
			return;
		}
	}

	
	//remove an item from the cart (return removed disc)
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		int check = qtyOrdered();
		for(int i = 0; i < check; i++) {
			if (itemsOrdered[i] == disc) {
				itemsOrdered[i] = null;
				System.out.println("The item is successfully removed");
				return;
			}
		}
		System.out.println("This disc is not exist in the cart");
		return;
	}
	
	// return the totalCost off all items in the cart
	public float totalCost() {
		float cost = 0;
		for (DigitalVideoDisc item : itemsOrdered) {
			if (item == null) {
				continue;
			}
			else {
				cost += item.getCost();
			}
		}
		return cost;
	}
}
