
public class MenuView { 
	
	public void displayGUIView() {
		  Subject subject = new Subject();

	      new WelcomeMenu(subject);
	      new PlayerName(subject);
	      new MainMenu(subject);
	      new DifficultyMenu(subject);
	      
	      subject.notifyAllObservers();
	}
	
} 
