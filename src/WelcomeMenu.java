import java.awt.GridLayout;

import javax.swing.JLabel;

public class WelcomeMenu extends Observer{

   public WelcomeMenu(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
		
   @Override
   public void displayFrame() {
		welcomeFrame.setLayout(new GridLayout(0, 1));
		label = new JLabel(" Welcome To Abominodo - The Best Dominoes Puzzle Game in the Universe ");
		welcomeFrame.add(label);
		label = new JLabel(" Version 1.0 (c), Kevan Buckley, 2010");
		welcomeFrame.add(label);
		welcomeFrame.pack();
		welcomeFrame.setVisible(true);
   }
   
}
