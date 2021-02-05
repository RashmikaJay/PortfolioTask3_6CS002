
public class MainRunAardvark {

	public static void main(String[] args) {
		Menu model = new Menu();
		MenuView view = new MenuView();
		ControllerMenu controller = new ControllerMenu(model, view);
		controller.updateView();
	}
	
}
