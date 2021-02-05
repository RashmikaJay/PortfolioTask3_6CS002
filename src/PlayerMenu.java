
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerName extends Observer{
	
	   public PlayerName(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void displayFrame() {
			label = new JLabel(MultiLinugualStringTable.getMessage(0));
			welcomeFrame.add(label);
			text = new JTextField(16); 
		    welcomeFrame.add(text);
		    button = new JButton("Ok");
			welcomeFrame.add(button);
			button.addActionListener(this); 
			welcomeFrame.pack();
	   }

}
