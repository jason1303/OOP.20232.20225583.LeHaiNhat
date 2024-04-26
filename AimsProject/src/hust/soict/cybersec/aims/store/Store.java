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
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		}
	
	
	
}	
