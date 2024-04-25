package hust.soict.cybersec.test.cart;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

public class CartTest {

	public static void main (String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87,19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Aimation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//cart.removeDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion Queen",
				"Animation", "Roger Allers", 87,19.95f);
		cart.addDigitalVideoDisc(dvd4);
		//Test the print method
		cart.print();
		
		
		cart.SearchDVDByTitle("The Lion Kinda");
		
		
	}

}
