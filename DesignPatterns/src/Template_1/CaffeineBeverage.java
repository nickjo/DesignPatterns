package Template_1;

public abstract class CaffeineBeverage {
	// ���� Ŭ��������  �� �޼ҵ带 �������̵� �Ͽ� �ƹ����Գ� ���Ḧ ������ ���ϵ��� final�� ����
	final void prepareRecipe(){ // ���ø� �޼ҵ� �Դϴ�.
		// ���ø� �޼ҵ忡���� �˰����� �� �ܰ���� �����ϸ�, ���� �Ѱ� �̻��� �ܰ谡 ����Ŭ������ ���� ������ �� �ֽ��ϴ�.
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	// ���� Ŭ�������� ������
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("�� ���̴� ��");
	}
	
	void pourInCup(){
		System.out.println("�ſ� ������ ��");
	}
	
}
