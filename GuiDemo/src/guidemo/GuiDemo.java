package guidemo;

public class GuiDemo {
	public static void main(String[] args) {
		new MainWindowController(new MainWindowModel(), new MainWindowView());
	}
}
