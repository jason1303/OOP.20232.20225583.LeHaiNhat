package hust.soict.aims.screen.manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.disc.CompactDisc;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;

public class StoreManagerScreen extends JFrame implements UpdateStore {
	
    private Store store;
    private JPanel cards;
    private CardLayout cardLayout;
    JPanel viewpanel;

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    
    
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem view = new JMenuItem("View store");
        menu.add(view);
        view.addActionListener(e -> {
        	viewpanel = createCenter();
        	cards.add(viewpanel,"View");
            cardLayout.show(cards, "View");
            StoreManagerScreen.this.setSize(1024, 768);
            this.revalidate();
            this.repaint();
        });

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");

        addBook.addActionListener(e -> {
            cardLayout.show(cards, "Book");
            StoreManagerScreen.this.setSize(600, 350);
            
        });
        smUpdateStore.add(addBook);

        JMenuItem cd = new JMenuItem("Add CD");
        cd.addActionListener(e -> {
            cardLayout.show(cards, "CD");
            StoreManagerScreen.this.setSize(600, 450);
        });
        smUpdateStore.add(cd);

        JMenuItem dvd = new JMenuItem("Add DVD");
        dvd.addActionListener(e -> {
            cardLayout.show(cards, "DVD");
            StoreManagerScreen.this.setSize(600, 425);
        });
        smUpdateStore.add(dvd);

        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media);
            center.add(cell);
        }
        return center;
    }


	public StoreManagerScreen(Store store) {
		
		
        
		this.store = store;
		Container cp = getContentPane();
		cardLayout = new CardLayout();
		cards = new JPanel (cardLayout);
		viewpanel = createCenter();
		
		JPanel addbook = new AddBookToStoreScreen(this);
		JPanel addDVD = new AddDigitalVideoDiscToStoreScreen(this);
		JPanel addCD= new AddCompactDiscToStoreScreen(this);
		
		cards.add(viewpanel,"View");
		cards.add(addbook,"Book");
		cards.add(addDVD,"DVD");
		cards.add(addCD,"CD");
		
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(cards,BorderLayout.CENTER);
		
		setTitle("Store");
		setSize(1024,768);
		setLocationRelativeTo(null);
		setVisible (true);
		
		
	}
	

	
	public static void main (String[] args) {
		Store store = new Store();
		
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
		new StoreManagerScreen(store);
			
		
		
		
	}


	@Override
	public void addbook(String title, String category, Float cost) {
		
		
		store.addMedia(new Book(title,category,cost));
		
		
	}


	@Override
	public void addDVD(String title, String category, Float cost, int length, String director) {
	// TODO Auto-generated method stub
		store.addMedia(new DigitalVideoDisc(title,category,cost,length,director));
		
	}


	@Override
	public void addCD(String title, String category, Float cost, int length, String director, String artist) {
		store.addMedia(new CompactDisc(title,category,cost,length,director,artist));
		
	}



}
    