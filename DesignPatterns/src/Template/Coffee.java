package Template;

public class Coffee {
	void prepareRecipe(){
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	
	public void boilWater(){
		System.out.println("�� ���̴� ��");
	}
	
	public void brewCoffeeGrinds(){
		System.out.println("���͸� ���ؼ� Ŀ�Ǹ� ���������");
	}
	
	public void pourInCup(){
		System.out.println("�ſ� ������ ��");
	}
	
	public void addSugarAndMilk(){
		System.out.println("������ ������ �߰��ϴ� ��");
	}
}


