package SubClass;

public class FacadeClass {
	HelpClass1 helpclass1;
	HelpClass2 helpclass2;
	HelpClass3 helpclass3;
	
	public FacadeClass() {
		// TODO Auto-generated constructor stub
		helpclass1 = new HelpClass1();
		helpclass2 = new HelpClass2();
		helpclass3 = new HelpClass3();
	}
	
	public void getAllProcess(){
		helpclass1.getClassName();
		helpclass2.getClassName();
		helpclass3.getClassName();
	}
}
