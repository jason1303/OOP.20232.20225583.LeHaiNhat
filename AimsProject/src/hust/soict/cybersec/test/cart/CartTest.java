package hust.soict.cybersec.test.cart;

import javax.naming.LimitExceededException;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

public class CartTest {

	public static void main (String[] args) throws LimitExceededException {
		//Create a new cart
		Cart cart = new Cart();
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", 19.95f, 87,"Roger Allers");
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", 24.95f, 87, "George Lucas");
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Aimation", 18.99f, 0, null);
		cart.addMedia(dvd3);
		
		//cart.removeDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion Queen",
				"Animation", 19.95f, 87,"Roger Allers");
		cart.addMedia(dvd4);
		//Test the print method
		cart.displayCart();;
		
		
		cart.searchMediaByTitle("The Lion Kinda");
		
		
	}

}
