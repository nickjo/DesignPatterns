import Concrete.FactoryInstance;
import abs.Button;
import abs.GuiFac;
import abs.TextArea;

public class Main {
	public static void main(String[] args) {
		try {
			// 사용하는 운영 체제와 상관없이 GuiFac 객체를 생성해준다.
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
