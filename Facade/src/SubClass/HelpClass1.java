package SubClass;

class HelpClass1 {
	
	public HelpClass1() {
		// TODO Auto-generated constructor stub
		System.out.println("Call getProcess: " + getClass().getSimpleName());
	}
	
	void getClassName(){
		System.out.println("Call getClassName: " + getClass().getSimpleName());
	}
}
