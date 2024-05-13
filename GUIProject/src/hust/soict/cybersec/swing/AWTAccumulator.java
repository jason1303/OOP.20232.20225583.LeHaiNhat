package hust.soict.cybersec.swing;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AWTAccumulator extends JFrame {
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2,2));
		add(new Label("Enter an Integer: "));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("The Accumulated Sum is:"));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("AWT Accumulatior");
		setSize(350,120);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AWTAccumulator();
	}
	
	public class TFInputListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum +"");
			
		}
		

	}
}






