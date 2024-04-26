import hust.soict.*;
import java.util.Scanner;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.disc.CompactDisc;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.disc.Disc;
import hust.soict.cybersec.aims.store.Store;

public class Aims {
	
	static Scanner scanner = new Scanner(System.in);
	static  Store store;
	static Cart cart;
	public static void main(String[] args) {
		
		store = new Store();
		cart = new Cart();
		
		//ADDING SOME MEDIA TO TEST THE FEATURE
		CompactDisc cd = new CompactDisc("Chung ta cua hien tai", "tinh cam",100000f, 999, "jason","sontungMTP");
		Book book = new Book("10 toi ac", "kinh di", 200f );
		DigitalVideoDisc dvd = new DigitalVideoDisc("be my mistake","sieu nhan",50f, 500,"hainhat");
		
		store.addMedia(dvd);
		store.addMedia(book);
		store.addMedia(cd);
		
		showMenu(); //start
		
		
		
	}
		
		
		
	
	public static void showMenu() {
		boolean run_welcome = true;
		while (run_welcome == true) {
			System.out.println("");
			System.out.println("");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("__________________________WELCOME_______________________");
			
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
			System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
			int menuchoice = scanner.nextInt();
			
			// action
			switch (menuchoice) {
			case 1: //view store
				storeMenu();
				break;
			case 2: //update store
				//he application will allow the user to add a media to or remove a media from the store
				System.out.println("This feature comming soon");
				break;
			case 3: //See current cart
				cart.displayCart();
				cartMenu();
				break;
			case 0: //exit 
				System.out.println("EXIT PROGRAM ...");
				run_welcome = false;
				break;
			default:
				System.out.println("Your option is invalid");
			}
			
			
		}
		return; 	// stop the program
		
		
		

		
	}
	public static void storeMenu() {
		boolean run_storeMenu = true;
		while (run_storeMenu == true) {
			System.out.println("");
			System.out.println("");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("_________________________STORE MENU______________________");
			
			// DISPLAY ALL ITEMS IN THE STORE
			store.displayItems();
			
			// show options
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media’s details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			
			//action 
			int storemenuchoice = scanner.nextInt();
			switch(storemenuchoice) {
			case 1: // see a media's details
				
				System.out.println("Enter the media to see it's details");
				String cDetails = scanner.nextLine();
				cDetails = scanner.nextLine();
				
				Media mediachoice1 = store.searchMediaByTitle(cDetails);
				if (mediachoice1 == null) {
					System.out.println("This media is not available in the store! ");
				}else {
					System.out.println(mediachoice1.toString());
					mediaDetailsMenu(mediachoice1);
				}
				break;
				
			case 2:	// add a media to cart
				System.out.println("Enter media's title to add it to the cart");
				String aMedia = scanner.nextLine();
				aMedia = scanner.nextLine();
				Media mediachoice2 = store.searchMediaByTitle(aMedia);
				if (mediachoice2 == null) {
					System.out.println("This media is not available in the store! ");
				}else {
					
					cart.addMedia(mediachoice2);
					cart.displayCart(); //display medias in the current cart
				}
				break;
				
			case 3: // play a media
				System.out.println("Enter media's title that you want to play");
				String pMedia = scanner.nextLine();
				pMedia = scanner.nextLine();
				
				Media mediachoice3 = store.searchMediaByTitle(pMedia);
				if (mediachoice3 == null) {
					System.out.println("This media is not available in the store! ");
				}else {
					System.out.println("Playing...");
					if(mediachoice3 instanceof Book) {
						System.out.println("Play feature is only available for CD and DVD");
					}else if (mediachoice3 instanceof CompactDisc ) {
						CompactDisc temp1 = (CompactDisc) mediachoice3;
						temp1.Play();
					}else if (mediachoice3 instanceof DigitalVideoDisc) {
						DigitalVideoDisc temp2 = (DigitalVideoDisc) mediachoice3;
						temp2.Play();
					}
				}
				break;
			case 4: // see current cart
				cart.displayCart();
				cartMenu();
				break;
				
			case 0: // back
				run_storeMenu = false;
				break;
			default:
				System.out.println("Your option is invalid");
				
				
			}
			
		}
		return;
		
	}
	
	public static void mediaDetailsMenu(Media media) {
		System.out.println("");
		System.out.println("");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("_____________________MEDIA_DETAILS_MENU_________________");
		
		boolean run_mediaDetailsMenu = true;
		
		while (run_mediaDetailsMenu) {
			
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");
			System.out.println("2. Play");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			
			
			int mediaDetailsMenuChoice = scanner.nextInt();
			switch (mediaDetailsMenuChoice) {
			case 1: //add to cart
				cart.addMedia(media);
				
			case 2: //play (ONLY AVAILABLE FOR CD AND DVD)
				if(media instanceof Book) {
					System.out.println("Play feature only available for CD and DVD");
				}else if (media instanceof CompactDisc ) {
					CompactDisc temp1 = (CompactDisc) media;
					temp1.Play();
				}else if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc temp2 = (DigitalVideoDisc) media;
					temp2.Play();
				}
			case 0: //back 
				run_mediaDetailsMenu = false;
				System.out.println("<---   <---   <---   <---   <---   <---   <---   ");
			default:
				System.out.println("Your option is invalid");
				
			}
			
			
		}
	}
	
	public static void cartMenu() {
		boolean run_cartMenu = true;
		while (run_cartMenu == true) {
			System.out.println("");
			System.out.println("");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("_________________________CART MENU_______________________");
			
			
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter media in cart");
			System.out.println("2. Sort media in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4-5");
			
			//action 
			int cartmenuchoice = scanner.nextInt();
			switch(cartmenuchoice) {
			case 1: //filter media in cart
				//allow the user to choose one of two filtering options: by id and by title
				System.out.println("This feature comming soon");
				cart.displayCart();
				break;
				
			case 2: //sort media in cart
				//allow the user to choose one of two sorting options: by title or by cost
				System.out.println("This feature comming soon");
				break;
				
			case 3: //remove media from cart
				System.out.println("Enter media's title that you want to play");
				String rMedia = scanner.nextLine();
				rMedia = scanner.nextLine();
				
				Media mediachoice3 = cart.searchMediaByTitle(rMedia);
				if (mediachoice3 == null) {
					System.out.println("This media is not available in your cart! ");
				}else {
					cart.removeMedia(mediachoice3);
				}
				break;
				
			case 4: //play a media
				System.out.println("Enter media's title that you want to play");
				String pMedia = scanner.nextLine();
				pMedia = scanner.nextLine();
				
				Media mediachoice4 = cart.searchMediaByTitle(pMedia);
				if (mediachoice4 == null) {
					System.out.println("This media is not available in your cart! ");
				}else {
					System.out.println("Playing...");
					if(mediachoice4 instanceof Book) {
						System.out.println("Play feature is only available for CD and DVD");
					}else if (mediachoice4 instanceof CompactDisc ) {
						CompactDisc temp1 = (CompactDisc) mediachoice4;
						temp1.Play();
					}else if (mediachoice4 instanceof DigitalVideoDisc) {
						DigitalVideoDisc temp2 = (DigitalVideoDisc) mediachoice4;
						temp2.Play();
					}
				}
				break;
			case 5: //place order
				System.out.println("YOUR ORDER IS CREATED <3");
				cart.emptyCart();
				break;
			case 0: //back
				run_cartMenu = false;
				System.out.println("<---   <---   <---   <---   <---   <---   <---   ");
				break;
			default:
				System.out.println("Your option is invalid");
				
			}
			
			
		}
		
	}
	
}//close aims class

		

