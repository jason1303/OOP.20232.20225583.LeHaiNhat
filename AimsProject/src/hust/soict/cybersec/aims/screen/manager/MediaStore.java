package hust.soict.cybersec.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.disc.Playable;

public class MediaStore extends JPanel {
	private Media media;
	Media getMedia() {
		return media;
	}
	public MediaStore (Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN,15));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		if (media instanceof Playable) {
			JButton playButton = new JButton("Play");
			playButton.addActionListener(new cell());
			container.add(playButton);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private class cell implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
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
}
