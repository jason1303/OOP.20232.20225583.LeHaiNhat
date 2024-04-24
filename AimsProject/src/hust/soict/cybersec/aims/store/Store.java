package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class Store {
	
	private int qtyitemsInStore;
	private DigitalVideoDisc itemsInStore[];
	private int maxstore ;

	//constructor
	public Store() {
		qtyitemsInStore = 0;
		itemsInStore = new DigitalVideoDisc[100];
		maxstore = 100;
	}
	public Store(int maxstore) {
		qtyitemsInStore = 0;
		itemsInStore = new DigitalVideoDisc[maxstore];
		this.maxstore = maxstore;
	}
	
	
	public void addDVD (DigitalVideoDisc dvd) {
		if (qtyitemsInStore == maxstore) {
			System.out.println("The store is full");
			return;
		}else {
			
			itemsInStore[qtyitemsInStore] = dvd;
			System.out.println("This DVD is added to store successfully");
			qtyitemsInStore +=1;
		}
		
	}
	
	public void removeDVD (DigitalVideoDisc dvd) {
		int index = -1;
		for (int i = 0 ; i < maxstore ; i ++) {
			if(itemsInStore[i] == dvd) {
				
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("This DVD is not found in the store");
			
		}else {
			qtyitemsInStore -= 1 ;
			System.out.println("This DVD is remove successfully");
			for (int i = index ; i < maxstore - 1; i++) {
				itemsInStore[i] = itemsInStore[i+1];	
			}
			itemsInStore[maxstore -1 ] = null;
		}
	}
}
