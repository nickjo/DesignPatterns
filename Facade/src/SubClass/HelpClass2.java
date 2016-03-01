package SubClass;

class HelpClass2 {
	
	public HelpClass2() {
		// TODO Auto-generated constructor stub
		System.out.println("Call getProcess: " + getClass().getSimpleName());
	}
	
	void getClassName(){
		System.out.println("Call getClassName: " + getClass().getSimpleName());
	}
}
