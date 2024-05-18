package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", 19.95f, 87,"Roger Allers");
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", 24.95f, 87, "George Lucas");
		
		store.addMedia(dvd2);
		store.addMedia(dvd1);
		
	}
}
