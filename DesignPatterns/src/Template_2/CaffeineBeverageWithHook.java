package Template_2;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();  
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("�� ���̴� ��");
	}
	
	void pourInCup(){
		System.out.println("�ſ� ������ ��");
	}
	
	// �� �޼ҵ�� ����Ŭ�������� �ʿ信 ���� �������̵� �� �� �ִ� �޼ҵ��̹Ƿ� ��ũ�Դϴ�.
	boolean customerWantsCondiments(){
		return true;
	}
}

