package Factory;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizaa(String type){
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		return pizza;
	}
}
