package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import guidemo.MainWindowController;

public class CounterListener implements ActionListener {

	private MainWindowController controller;
	
	public CounterListener(MainWindowController controller) {
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "increase": {
				controller.getModel().increase();
				break;
			}
			case "decrease": {
				controller.getModel().decrease();
				break;
			}
			case "resetCounter": {
				controller.getModel().resetCounter();
				break;
			}
			default: {
				throw new RuntimeException("ActionCommand unknown");
			}
		}
		
	}

}
