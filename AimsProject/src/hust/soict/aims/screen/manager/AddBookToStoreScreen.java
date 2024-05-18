package hust.soict.aims.screen.manager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import hust.soict.cybersec.aims.media.Book;

class AddBookToStoreScreen extends AddItemToStoreScreen {
	
	@Override
	JLabel createHeader() {
        JLabel title = new JLabel("Adding book to store");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        title.setHorizontalAlignment(JLabel.CENTER);
        return title;
    }
	
	@Override
	protected void addActionListenerToAdd() {
    	add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            		updatestore.addbook(title.getText(),category.getText(),Float.parseFloat(cost.getText()));                
        		} catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid data.");
                }
            
            }
        });
    }
    
    @Override
    protected void addActionListenerToCancel() {
        cancel.addActionListener(new ActionListener() { // Corrected here
            @Override
            public void actionPerformed(ActionEvent e) {
                title.setText("");
                category.setText("");
                cost.setText("");
            }
        });
    }

    public AddBookToStoreScreen(UpdateStore udstore) {
        super(udstore);
    }
}
