
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

	//overloading method addDigitalVideoDisc (section 14.1)

	public void addDigitalVideoDisc (DigitalVideoDisc... dvdlist) {
		int check = qtyOrdered();
		if(dvdlist.length == 0) {
			System.out.println("No DVDs providede to add to the cart");
		}else {
			for (int i = 0 ; i < dvdlist.length; i++ ) {
				if (check == 20) {
					System.out.println("The cart is already full, cannot add more DVD into the cart");
					return;
				}else {
					itemsOrdered[check] = dvdlist[i];
					check += 1;
				}
				
			}
			return;
			
		}
	}
	
	
	
// overloading method addDigitalVideoDisc (section 14.2)
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int check = qtyOrdered();
		if (check == 20) {
			System.out.println("The cart is already full, cannot add more DVD into the cart");
			return;
		}else if (check == 19) {
			itemsOrdered[check] = dvd1;
			System.out.println("Add only the first DVD into the cart due to maximum number of DVD in the cart");
			return;
		}else {
			itemsOrdered[check] = dvd1;
			itemsOrdered[check+1]=dvd2;
			System.out.print("The DVDs is successfully added into the cart");
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
