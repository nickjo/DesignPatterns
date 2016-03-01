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
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup(){
		System.out.println("컵에 따르는 중");
	}
	
	// 이 메소드는 서브클래스에서 필요에 따라 오버라이드 할 수 있는 메소드이므로 후크입니다.
	boolean customerWantsCondiments(){
		return true;
	}
}

