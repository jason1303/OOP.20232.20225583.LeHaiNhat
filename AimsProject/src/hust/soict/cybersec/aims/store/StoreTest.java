package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87,19.95f);
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		
		store.addMedia(dvd2);
		store.addMedia(dvd1);
		
	}
}
