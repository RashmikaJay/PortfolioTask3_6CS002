import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Observer extends JFrame implements ActionListener{
	static JTextField text; 
	static JFrame welcomeFrame = new JFrame("Aardvark");  
	static JFrame mainMenuFrame = new JFrame("Aardvark Main Menu");
	static JFrame difficultyMenuFrame = new JFrame("Aardvark Difficulty Menu");
	static JButton button; 
	static JLabel label; 
	static Menu model = new Menu();
	static MenuView view = new MenuView();
	static ControllerMenu controller = new ControllerMenu(model, view);
	static protected Aardvark aardvark2;
	static int level;
	
	protected Subject subject;
	
	public abstract void displayFrame();

	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("Ok")) { 
			controller.setPlayerName(text.getText());
			aardvark2.playerName = model.getName();
			welcomeFrame.dispose();
			mainMenuFrame.setVisible(true);
		} else if (s.equals("Play")){
			difficultyMenuFrame.setVisible(true);
		} else if (s.equals("View Rules")){
			aardvark2.viewRules();
		} else if (s.equals("View High Scores")){
			aardvark2.viewHighScores();
		} else if (s.equals("Quit")){
			aardvark2.quitGame();
		} else if (s.equals("Simples")){
			level = 1;
			aardvark2.playGame();
		} else if (s.equals("Not-so-simples")){
			level = 2;
			aardvark2.playGame();
		} else if (s.equals("Super-duper-shuffled")){
			level = 3;
			aardvark2.playGame();
		}
	}

}
