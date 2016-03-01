package SubClass;

class HelpClass3 {
	public HelpClass3() {
		// TODO Auto-generated constructor stub
		System.out.println("Call getProcess: " + getClass().getSimpleName());
	}
	
	void getClassName(){
		System.out.println("Call getClassName: " + getClass().getSimpleName());
	}
}
