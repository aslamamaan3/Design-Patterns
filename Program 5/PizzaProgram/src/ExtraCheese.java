
public class ExtraCheese extends ToppingDecorator{
	
	Pizza newPizza;
	public ExtraCheese(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Extra Cheese, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.85;
	}
}