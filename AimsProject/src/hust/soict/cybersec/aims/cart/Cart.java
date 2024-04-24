package hust.soict.cybersec.aims.cart;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[]= 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered  = 0 ;
	
	
	
	
	
	// add an item into the cart (return added disc)
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is already full, can not add more DVD into the cart");
			return;
		}
		else { 
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The DVD is added to the cart");
			qtyOrdered += 1;					// update the #DVD in the cart
		}
	}

	//overloading method addDigitalVideoDisc (section 14.1)

	public void addDigitalVideoDisc (DigitalVideoDisc... dvdlist) {
		if(dvdlist.length == 0) {
			System.out.println("No DVDs provided to add to the cart");
		}else {
			for (int i = 0 ; i < dvdlist.length; i++ ) {
				if (qtyOrdered == 20) {
					System.out.println("The cart is already full");
					return;
				}else {
					itemsOrdered[qtyOrdered] = dvdlist[i];
					qtyOrdered +=1;					// update the #DVD in the cart
				}
				
			}
			return;
			
		}
	}
	
// overloading method addDigitalVideoDisc (section 14.2)
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is already full, cannot add more DVD into the cart");
			return;
		}else if (qtyOrdered == 19) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;			//update the #DVD in the cart
			System.out.println("Add only the first DVD into the cart due to maximum number of DVD in the cart");
			return;
		}else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;			//update the #DVD in the cart
			itemsOrdered[qtyOrdered+1]=dvd2;
			qtyOrdered += 1;			//update the #DVD in the cart
			System.out.print("The DVDs is successfully added into the cart");
		}
	}

	
	//remove an item from the cart (return removed disc)
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {   //only remove 1 items at once
		int index = -1;
		for (int i = 0 ; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("This DVD is not in the cart");
			return;
		}else {
			qtyOrdered -= 1;			//update the #DVD in the cart
			for (int i = index; i < 20 -1; i++) {
				itemsOrdered[i] = itemsOrdered[i+1];
			}
			itemsOrdered[19] = null;
			
			return;
		}
		
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
	
	//Lap03.4: Update the cart class and CartTest class
	public void print() {
		DigitalVideoDisc temp;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items");
		for(int i = 0 ; i < qtyOrdered ; i++) {
			temp = itemsOrdered[i];
			System.out.println(i+ ". "+ temp.toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	public void SearchDVDByID(int ID ) {
		boolean condition = false;
		for (DigitalVideoDisc dvd : itemsOrdered) {
			if (dvd == null) {
				break;
			}else {
				if (dvd.getID() == ID) {
					condition = true;
					System.out.println(dvd.toString());
				}
				
			}
			
		}
		if (condition == false ) {
			System.out.println("This DVD is not found!");
		}
	}
	public void SearchDVDByTitle(String title) {
		boolean condition = false;
		for (DigitalVideoDisc dvd : itemsOrdered) {
			if (dvd == null) {
				break;
			}else {
				if (dvd.getTitle() == title) {
					condition = true;
					System.out.println(dvd.toString());
				}
			}
		}
		if (condition == false) {
			System.out.println("This DVD is not found!");
		}
	}
}
