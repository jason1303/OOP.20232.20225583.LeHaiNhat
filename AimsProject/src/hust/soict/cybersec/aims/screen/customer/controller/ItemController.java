package hust.soict.cybersec.aims.screen.customer.controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.naming.LimitExceededException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.exception.PlayerException;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.disc.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ItemController {

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblCost;

    @FXML
    private Label lblTitle;
    
    
    private Media media;
    private Cart cart;
    
    public ItemController(Cart cart) {
    	this.cart = cart;
    }
    
    public void setData(Media media) {
    	this.media = media;
    	lblTitle.setText(media.getTitle());
    	lblCost.setText(media.getCost() + " $");
    	if (media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}else {
    		btnPlay.setVisible(false);
    		HBox.setMargin(btnAddToCart, new Insets(0, 0, 0 ,60));
    	}
    	
    }

    
    
    @FXML
    void btnAddToCartClicked(ActionEvent event) throws LimitExceededException {
    	if (cart.getItemsOrdered().size() < cart.getMaxNumberOrdered()) {
    		cart.addMedia(this.media);
        	Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("Item has been added to the store successfully!");

            alert.showAndWait();
    	}else {
    		throw new LimitExceededException("ERROR: The number of media has reached its limit");
    	}
    	
    }

    @FXML
    void btnPlayClicked(ActionEvent event) {
    	
    	JButton playButton;
	    JButton stopButton;
		JDialog dialog = new JDialog();
	    dialog.setSize(300, 200);
	    dialog.setLayout(new BorderLayout());
	    dialog.setVisible(true);
	    dialog.setTitle("MediaPlayer");
	    dialog.setLayout(new GridLayout(2, 2));
	    
	    dialog.add(new JLabel("Name:"));
        JLabel nameField = new JLabel(media.getTitle());
        dialog.add(nameField);
        
        JButton play = new JButton("Play");
        JButton pause = new JButton("Pause");
        
        dialog.add(play);
        dialog.add(pause);
    }

}
