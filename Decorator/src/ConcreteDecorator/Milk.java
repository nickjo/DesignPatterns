package ConcreteDecorator;

import Component.Baverage;
import Decorator.CondimentDecorator;

public class Milk extends CondimentDecorator{
	Baverage baverage;
	
	public Milk(Baverage baverage) {
		// TODO Auto-generated constructor stub
		this.baverage = baverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return baverage.getDescription() + " ¿ìÀ¯";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return baverage.cost() + 250;
	}

}
