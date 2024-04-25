package hust.soict.cybersec.aims.cart;
import java.util.ArrayList;


import hust.soict.cybersec.aims.media.Media;

public class Cart {
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		int index = -1;
		for (int i = 0 ; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i) == media) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			itemsOrdered.remove(index);
		}else {
			System.out.println("This item is not found in the cart");
		}
		
	}

	// return the totalCost off all items in the cart
	public float totalCost() {
		float cost = 0;
		for (Media item : itemsOrdered) {
			cost += item.getCost();
		}
		return cost;
	}
	
	//Lap03.4: Update the cart class and CartTest class
//	public void print() {
//		DigitalVideoDisc temp;
//		System.out.println("***********************CART***********************");
//		System.out.println("Ordered Items");
//		for(int i = 0 ; i < qtyOrdered ; i++) {
//			temp = itemsOrdered[i];
//			System.out.println(i+ ". "+ temp.toString());
//		}
//		System.out.println("Total cost: " + totalCost());
//		System.out.println("***************************************************");
//	}
//	public void SearchDVDByID(int ID ) {
//		boolean condition = false;
//		for (DigitalVideoDisc dvd : itemsOrdered) {
//			if (dvd == null) {
//				break;
//			}else {
//				if (dvd.getID() == ID) {
//					condition = true;
//					System.out.println(dvd.toString());
//				}
//				
//			}
//			
//		}
//		if (condition == false ) {
//			System.out.println("This DVD is not found!");
//		}
//	}
//	public void SearchDVDByTitle(String title) {
//		boolean condition = false;
//		for (DigitalVideoDisc dvd : itemsOrdered) {
//			if (dvd == null) {
//				break;
//			}else {
//				if (dvd.getTitle() == title) {
//					condition = true;
//					System.out.println(dvd.toString());
//				}
//			}
//		}
//		if (condition == false) {
//			System.out.println("This DVD is not found!");
//		}
//	}
}
