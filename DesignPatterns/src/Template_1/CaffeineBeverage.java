package Template_1;

public abstract class CaffeineBeverage {
	// 하위 클래스에서  이 메소드를 오버라이드 하여 아무렇게나 음료를 만들지 못하도록 final를 선언
	final void prepareRecipe(){ // 템플릿 메소드 입니다.
		// 템플릿 메소드에서는 알고리즘의 각 단계들을 정의하며, 그중 한개 이상의 단계가 서브클래스에 의해 제공될 수 있습니다.
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	// 서브 클래스에서 재정의
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup(){
		System.out.println("컵에 따르는 중");
	}
	
}
