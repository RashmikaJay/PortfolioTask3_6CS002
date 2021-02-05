import java.awt.GridLayout;

import javax.swing.JButton;

public class DifficultyMenu extends Observer{
	
	public DifficultyMenu(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
			
	   @Override
	   public void displayFrame() {
		   difficultyMenuFrame.setLayout(new GridLayout(0, 1));
		   	button = new JButton("Simples");
		   	difficultyMenuFrame.add(button);
			button.addActionListener(this); 
			button = new JButton("Not-so-simples");
			difficultyMenuFrame.add(button);
			button.addActionListener(this); 
			button = new JButton("Super-duper-shuffled");
			difficultyMenuFrame.add(button);
			button.addActionListener(this); 
			difficultyMenuFrame.pack();
		   aardvark2 = new Aardvark(level);
	   }
	   

}
