package hust.soict.cybersec.aims.cart;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	

	//overloading method addDigitalVideoDisc (section 14.1)

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
