package hust.soict.aims.screen.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
	JTextField length;
	JTextField director;
	
	JLabel lengthLabel;
	JLabel directorLabel;
	
	@Override
	protected void addActionListenerToAdd() {
    	add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                
                try {
                	updatestore.addDVD(title.getText(),category.getText(),Float.parseFloat(cost.getText()),Integer.parseInt(length.getText()),director.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid data.");
                }
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
            	
            }
        });
	}
    public AddDigitalVideoDiscToStoreScreen(UpdateStore udstore) {
        super(udstore);
        this.length = new JTextField(20);
    	this.director = new JTextField(20);
    	
    	this.lengthLabel = new JLabel("Length");
    	directorLabel = new JLabel("Director");
        gbc.gridx = 0;
        gbc.gridy = 3;
        center.add(lengthLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        center.add(length, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        center.add(directorLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        center.add(director, gbc);
    }
}