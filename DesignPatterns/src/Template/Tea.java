package Template;

public class Tea {
	void prepareRecipe(){
		boilWater();
		steepTeaBag();
		addLemon();
		pourInCup();		
	}
	
	public void boilWater(){
		System.out.println("�� ���̴� ��");
	}
	
	public void steepTeaBag(){
		System.out.println("���� ������� ��");
	}
	
	public void addLemon(){
		System.out.println("������ �߰��ϴ� ��");
	}
	
	public void pourInCup(){
		System.out.println("�ſ� ������ ��");
	}
}
