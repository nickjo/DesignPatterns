package ConcreteComponent;

import Component.Baverage;

public class Espresso extends Baverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "����������";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2000;
	}
}
