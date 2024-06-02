package hust.soict.cybersec.aims.screen.customer.controller;

import java.io.IOException;
import java.util.Optional;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.disc.Playable;
import hust.soict.cybersec.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CartController{
	

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, Integer> colMediaId;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private Label costLabel;
    
    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;
    
    private Cart cart;
    private Store store;
    
    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
    	if (this.cart.getItemsOrdered().size() == 0 ) {
    		Alert warn = new Alert(AlertType.WARNING);
    		warn.setTitle("Warning");
            warn.setHeaderText("There are no items in the cart!!");
            warn.showAndWait();
    	}
    	else {
    		Alert confirm = new Alert(AlertType.CONFIRMATION);
    		confirm.setTitle("Confirmation");
    		confirm.setHeaderText(null);
    		confirm.setContentText("Are you sure you want place order all items in your cart?");

            Optional<ButtonType> result = confirm.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
            	Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("The order has been placed successfully!");

                alert.showAndWait();
            } 
    	}
    	
    }
    
    public CartController( Store store,Cart cart) {
    	this.cart = cart;
    	this.store = store;
    	
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
    	
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    	costLabel.setText(cart.totalCost() + " $");
    }

    @FXML
    void btnViewStorePressed(ActionEvent event) {
    	try {
    		final String CART_FXML_FILE_PATH = "/hust/soict/cybersec/aims/screen/customer/view/Store.fxml";
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
    		fxmlLoader.setController(new ViewStoreController(store,cart));
    		Parent root = fxmlLoader.load();
    		Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    		stage.setScene(new Scene(root));
    		stage.setTitle("Store");
    		stage.show();
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    
    @FXML
    public void initialize() {
    	
    	colMediaId.setCellValueFactory(new PropertyValueFactory<Media, Integer>("id"));
    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    	colMediaCategory.setCellValueFactory(new PropertyValueFactory <Media, String> ("category"));
    	colMediaCost.setCellValueFactory(new PropertyValueFactory<Media,Float> ("cost"));
    	
    	if (cart.getItemsOrdered()!= null) {
    		tblMedia.setItems(cart.getItemsOrdered());
    	}
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
 
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

			@Override
			public void changed(ObservableValue<? extends Media> observable, Media oldvalue, Media newValue) {
				// TODO Auto-generated method stub
				updateButtonBar(newValue);
				
			}

			void updateButtonBar(Media media) {
				// TODO Auto-generated method stub
				if(media == null) {
	    			btnPlay.setVisible(false);
	    			btnRemove.setVisible(false);
	 
	    		}else {
	    			btnRemove.setVisible(true);
	    			if(media instanceof Playable) {
	    				btnPlay.setVisible(true);
	    			}else {
	    				btnPlay.setVisible(false);
	    			}
	    		}
			}
			
    		
    	});	
    	costLabel.setText(cart.totalCost() + " $");
    	
	}
    	
}


