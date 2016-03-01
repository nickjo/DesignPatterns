package ConcreteComponent;

import Component.Baverage;

public class DarkRoast extends Baverage{
	
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description = "다크로스트";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2500;
	}

}
