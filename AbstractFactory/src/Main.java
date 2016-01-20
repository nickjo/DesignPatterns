import Concrete.FactoryInstance;
import abs.Button;
import abs.GuiFac;
import abs.TextArea;

public class Main {
	public static void main(String[] args) {
		try {
			// ����ϴ� � ü���� ������� GuiFac ��ü�� �������ش�.
			GuiFac fac = FactoryInstance.getGuiFac();
			Button button = fac.createButton();
			TextArea textArea = fac.createTextArea();
			
			button.click();
			System.out.println(textArea.getTextArea());
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}
	}
}
