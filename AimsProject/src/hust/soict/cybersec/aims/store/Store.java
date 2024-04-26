package hust.soict.cybersec.aims.store;

import java.util.ArrayList;


import hust.soict.cybersec.aims.media.Media;

public class Store {
	//instance attribute
	ArrayList<Media> storeItems;
	
	//constructor
	public Store() {
		storeItems = new ArrayList<Media>();
	}
	//method
	public void addMedia(Media media) {
		for(int i = 0 ; i < storeItems.size(); i++) {
			if (storeItems.get(i) == media) {
				System.out.println("This media is already in the store");
				return;
			}
		}
		storeItems.add(media);
	}
	
	public void removeMedia(Media media) {
		int index = -1;
		for (int i = 0 ; i<storeItems.size() ; i++) {
			if (storeItems.get(i) == media) {
				storeItems.remove(index);
				System.out.println("This media is removed from the store");
				return;
			}
		}
		System.out.println("This media is not available in the store");
		
		
	}
	//**********************************************************************************************
	// 					UPDATE FOR CONSOLE APPLICATION
	
	
	//display all items in the store
	public void displayItems() {
		System.out.println("--------------------------------");
		System.out.println("ITEMS AVAILABLE IN THE STORE");
		int cc = 0;
		for (Media media : storeItems) {
			System.out.println(media.getTitle());
			cc += 1;
		}
		System.out.println("Total: " + cc + " items");
	}
	
	// see media's details by it's title
	
	public Media searchMediaByTitle(String title) {
		for (Media media : storeItems) {
			if (media.getTitle().equalsIgnoreCase(title)) {
				return media;
			}
		}

		return null;
	}
	
	
	
	//**********************************************************************************************

	
}	
