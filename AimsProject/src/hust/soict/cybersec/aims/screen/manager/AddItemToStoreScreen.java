package hust.soict.cybersec.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddItemToStoreScreen extends JPanel {
	
		UpdateStore updatestore;
		
		JTextField title;
		JTextField category;
		JTextField cost;
		
		JLabel titleLabel;
		JLabel categoryLabel;
		JLabel costLabel;
		
        JButton add = new JButton("Add");
        JButton cancel = new JButton("Cancel");
        
        JPanel center;
        GridBagConstraints gbc;

        protected void addActionListenerToAdd() {
        	add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                 
                    updatestore.addbook(title.getText(),category.getText(),Float.parseFloat(cost.toString()));
                }
            });
        }
        
        
        
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

        

        JLabel createHeader() {
            JLabel title = new JLabel("Adding item to store");
            title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
            title.setHorizontalAlignment(JLabel.CENTER);
            return title;
        }

        JPanel createBottom() {
            JPanel panel = new JPanel();
            panel.add(add);
            panel.add(cancel);
            return panel;
        }
        
        public AddItemToStoreScreen(UpdateStore udstore) {
        	this.updatestore = udstore;
        	this.title = new JTextField(20);
        	this.category = new JTextField(20);
        	this.cost = new JTextField(20);
        	
        	this.titleLabel = new JLabel("Title");
        	this.categoryLabel = new JLabel("Category");
        	this.costLabel = new JLabel("Cost");
        	
            setLayout(new BorderLayout());
            add(createHeader(), BorderLayout.NORTH);

            center = new JPanel();
            center.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();

            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            gbc.gridx = 0;
            gbc.gridy = 0;
            center.add(titleLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            center.add(title, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            center.add(categoryLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            center.add(category, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            center.add(costLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 2;
            center.add(cost, gbc);

            add(center, BorderLayout.CENTER);
            add(createBottom(), BorderLayout.SOUTH);

            addActionListenerToAdd();
            addActionListenerToCancel();

            setVisible(true);
        }
    }