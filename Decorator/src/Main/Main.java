package Main;

import Component.Baverage;
import ConcreteComponent.Americano;
import ConcreteComponent.DarkRoast;
import ConcreteComponent.Espresso;
import ConcreteDecorator.*;

public class Main {
	public static void main(String[] args) {
		Baverage b1 = new Whipping(new Milk(new Moca(new Americano())));
		Baverage b2 = new Milk(new Espresso());
		Baverage b3 = new DarkRoast();
		
		System.out.println("커피종류:" + b1.getDescription() + ", \t가격:" + b1.cost());
		System.out.println("커피종류:" + b2.getDescription() + ", \t\t가격:" + b2.cost());
		System.out.println("커피종류:" + b3.getDescription() + ", \t\t가격:" + b3.cost());
	}
}
