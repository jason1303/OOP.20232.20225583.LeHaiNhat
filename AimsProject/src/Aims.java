

import java.util.Scanner;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		boolean program = true;
		Scanner scanner = new Scanner(System.in);
		while (program == true) {
			showMenu();
			int choice  = scanner.nextInt();
			
			switch (choice) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                continueProgram = false;
                break;
            default:
                System.out.println("Invalid choice!");
		}
		
		
		
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
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
		
}
