package ConcreteComponent;

import Component.Baverage;

public class Americano extends Baverage{
	
	public Americano() {
		// TODO Auto-generated constructor stub
		description = "Americano";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
