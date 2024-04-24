package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class Store {
	
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
}
