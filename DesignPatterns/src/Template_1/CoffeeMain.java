package Template_1;

public class CoffeeMain {
	public static void main(String args[]){
		Coffee myCoffee = new Coffee();
		Tea myTea = new Tea();
		
		myCoffee.prepareRecipe();
		myTea.prepareRecipe();
	}
}
