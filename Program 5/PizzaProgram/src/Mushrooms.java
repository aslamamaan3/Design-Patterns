
public class Mushrooms extends ToppingDecorator{
	
	Pizza newPizza;
	public Mushrooms(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Mushrooms, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.75;
	}
}
