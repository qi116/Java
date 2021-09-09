package jrJava.nestedClass3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StockTradeGUI {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textField;
	
	public StockTradeGUI(){
		
		frame = new JFrame();
		frame.setTitle("Stock Trade");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		panel.setLayout(null); 
		
		button = new JButton("Buy Stock");
		button.setBounds(50, 50, 120, 20);
		panel.add(button);
		
		textField = new JTextField();
		textField.setBounds(50, 200, 270, 20);
		panel.add(textField);
		 
		button.addActionListener(new BuyAgent());
		
		frame.setVisible(true); 
	}
	
	
	private String sayHello(){
		return "Hello";
	}
	
	 
	public class BuyAgent implements ActionListener {

		// business fields;
		// business methods;
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button){
				processBuying("XYZ", 1000);
				textField.setText(sayHello() + " Just purchased 1000 stocks of XYZ company.");
			}
		}
		
			
		private void processBuying(String name, int quantity){
			// business logic.
		}
		
	}

	
	public static void main(String[] args) {
		new StockTradeGUI();
	}

}







