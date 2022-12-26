package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Word_Counter {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("Word Counter");
		jFrame.setLayout(null);
		jFrame.setBounds(100,100,1000,1000);
		jFrame.setVisible(true);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50,50,300,200);
		
		JButton button = new JButton("Check");
		button.setBounds(100,300,100,30);
	
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 1- Get text from text area
				String text = textArea.getText();
				
				// 2- Splitting up the string and storing word into []
				if(!text.equals("")) {
					String[] word = text.split(" ");
					
					// 3- Display the result of words
					JOptionPane.showMessageDialog(jFrame, "Total words: " + word.length);
				}
				
			}
		});
	
		jFrame.add(textArea);
		jFrame.add(button);
		
	
	}

}
