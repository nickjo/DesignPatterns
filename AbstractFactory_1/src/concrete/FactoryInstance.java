package concrete;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class FactoryInstance {

	public static GuiFac getGuiFac() {
		// TODO Auto-generated method stub
		switch (getOsCode()) {
			case "M": return new MacGuiFac();
			case "L": return new LinuxGuiFac();
			case "W": return new WinGuiFac();
		}
		return null;
	}
	
	static String getOsCode(){
		String osName = System.getProperty("os.name");
		return osName.substring(0, 1);
	}
}

// Linux Class Start
class LinuxButton implements Button{
	
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("LinuxButton Click");
	}
}

class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}
}

class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		String str = "LunuxTextArea getText 호출";
		return str;
	}
}
//Linux Class End



// Mac Class Start
class MacButton implements Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("MacButton Click");
	}
}

class MacGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}
}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "MacTextArea getText 호출";
	}
}
// Mac Class End


// Win Class Start
class WinButton implements Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("WinButton Click");
	}
}

class WinGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}
}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "WinTextArea getText 호출";
	}
}
//Win Class End





