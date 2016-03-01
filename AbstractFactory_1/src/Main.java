import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {
	public static void main(String[] args) {
		GuiFac fac = FactoryInstance.getGuiFac();
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		
		//System.out.println((System.getProperty("os.name")).substring(0, 1));
		
		/*// Linux Gui ����
		fac = new LinuxGuiFac();
		button = fac.createButton();
		area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		
		System.out.println();
		
		// Mac Gui ����
		fac = new MacGuiFac();
		button = fac.createButton();
		area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		
		System.out.println();
		
		// Win Gui ����
		fac = new WinGuiFac();
		button = fac.createButton();
		area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		*/
	}
}
