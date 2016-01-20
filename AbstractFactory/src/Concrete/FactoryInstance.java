package Concrete;

import abs.Button;
import abs.GuiFac;
import abs.TextArea;

public class FactoryInstance {
	
	public static GuiFac getGuiFac() throws Exception{
		switch (getOsName()) {
			case "M": return new MacGuiFac();
			case "L": return new LinuxGuiFac();
			case "W": return new WinGuiFac();
		}
		throw new Exception("지원하지 않는 운영체제 입니다.");
	}
	
	static String getOsName(){
		return (System.getProperty("os.name")).substring(0, 1);
	}
}

// Linux Start
class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}
}

class LinuxButton implements Button {
	
	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Linux Button Click()");
	}
}

class LinuxTextArea implements TextArea {

	@Override
	public String getTextArea() {
		// TODO Auto-generated method stub
		return "LinuxTextArea getTextArea()";
	}
}
// Linux End

// Mac Start
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

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("MacButton Click()");
	}
}

class MacTextArea implements TextArea {

	@Override
	public String getTextArea() {
		// TODO Auto-generated method stub
		return "MacTextArea getTextArea()";
	}
}
// Mac End

// Win Start
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

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("WinButton Click()");
	}
}

class WinTextArea implements TextArea {

	@Override
	public String getTextArea() {
		// TODO Auto-generated method stub
		return "WinTextArea getTextArea()";
	}
}
// Win End

