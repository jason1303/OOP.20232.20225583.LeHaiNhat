package hust.soict.cybersec.aims.screen.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import hust.soict.cybersec.aims.media.disc.CompactDisc;

public class AddCompactDiscToStoreScreen extends AddDigitalVideoDiscToStoreScreen {
	JTextField artist;

	JLabel artistLabel;
	
    @Override
    protected void addActionListenerToAdd() {
        add.addActionListener(e -> {
            try {
            	updatestore.addCD(title.getText(),category.getText(),Float.parseFloat(cost.getText()),Integer.parseInt(length.getText()),director.getText(),artist.getText());
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid data.");
            }
        });	
	}
    @Override
    protected void addActionListenerToCancel() {
        
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	title.setText("");
            	category.setText("");
            	cost.setText("");
            	length.setText("");
            	director.setText("");
            	artist.setText("");
            }
        });
	}
    
    
    public AddCompactDiscToStoreScreen(UpdateStore udstore) {
	
		
		super(udstore);
		this.artist = new JTextField(20);
		this.artistLabel = new JLabel("Artist");
		
		gbc.gridx = 0;
        gbc.gridy = 5;
        center.add(artistLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        center.add(artist,gbc);
    }
}
