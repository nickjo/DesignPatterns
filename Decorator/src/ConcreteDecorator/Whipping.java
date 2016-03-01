package ConcreteDecorator;

import Component.Baverage;
import Decorator.CondimentDecorator;

public class Whipping extends CondimentDecorator{
	Baverage baverage;
	
	public Whipping(Baverage baverage) {
		// TODO Auto-generated constructor stub
		this.baverage = baverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return baverage.getDescription() + " »÷«Œ≈©∏≤";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return baverage.cost() + 700;
	}
}
