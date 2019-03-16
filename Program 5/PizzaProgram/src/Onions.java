
public class Onions extends ToppingDecorator{
	
	Pizza newPizza;
	public Onions(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Onions, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.50;
	}
}
