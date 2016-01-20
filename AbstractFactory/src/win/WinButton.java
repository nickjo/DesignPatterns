package win;

import abs.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("WinButton Click");
	}
}
