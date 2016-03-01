package ConcreteDecorator;

import Component.Baverage;
import Decorator.CondimentDecorator;

public class Moca extends CondimentDecorator{
	Baverage baverage;
	
	public Moca(Baverage baverage) {
		// TODO Auto-generated constructor stub
		this.baverage = baverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return baverage.getDescription() + " ¸ðÄ«";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return baverage.cost() + 500;
	}
}
