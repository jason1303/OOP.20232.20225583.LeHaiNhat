package hust.soict.cybersec.test.screen.customer.store;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.screen.customer.controller.ViewStoreController;
import hust.soict.cybersec.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
	
	public static Store store;
	public static Cart cart;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		

		final String STORE_FXML_FILE_PATH = "/hust/soict/cybersec/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store,cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		arg0.setTitle("Store");
		arg0.setScene(new Scene(root));
		arg0.show();
	}
	
	
	public static void main (String[] args) {
		store = new Store();
		Book book1 = new Book("jason","the killer",125);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", 19.95f, 87,"Roger Allers");
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", 24.95f, 87, "George Lucas");
		
		
		DigitalVideoDisc dv2 = new DigitalVideoDisc("Star War", 
				"Science Fiction", 24.95f, 87, "George Lucas");
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
				"Animation", 19.95f, 87,"Roger Allers");
		store.addMedia(dvd2);
		store.addMedia(dvd4);
		store.addMedia(dv2);
		store.addMedia(dvd1);
		cart = new Cart();
		store.addMedia(book1);
		launch(args);
	}
	

}
