
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainMenu extends Observer{
	
	public MainMenu(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
			
	   @Override
	   public void displayFrame() {
		   mainMenuFrame.setLayout(new GridLayout(0, 1));
		   label = new JLabel(MultiLinugualStringTable.getMessage(1) + ". " + MultiLinugualStringTable.getMessage(2));
			mainMenuFrame.add(label);
		   	button = new JButton("Play");
			mainMenuFrame.add(button);
			button.addActionListener(this); 
			button = new JButton("View High Scores");
			mainMenuFrame.add(button);
			button.addActionListener(this); 
			button = new JButton("View Rules");
			mainMenuFrame.add(button);
			button.addActionListener(this); 
			button = new JButton("Quit");
			mainMenuFrame.add(button);
			button.addActionListener(this); 
			mainMenuFrame.pack();
	   }

}
