package hust.soict.cybersec.aims.cart;
import java.util.ArrayList;

import javax.naming.LimitExceededException;

import hust.soict.cybersec.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

	
	public static int getMaxNumberOrdered() {
		return MAX_NUMBER_ORDERED;
	}

	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void addMedia(Media media) throws LimitExceededException{
		if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(media);
		}else {
			throw new LimitExceededException("ERROR: The number of media has reached the limit");
		}
		
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
	
	
	//*************************************************************************
	//UPDATE FOR CONSOLE APPLICATION
	public void displayCart() {
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
	}
	
	public Media searchMediaByTitle(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equalsIgnoreCase(title)) {
				return media;
			}
		}

		return null;
	}
	public void emptyCart() {
		itemsOrdered.clear();
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
