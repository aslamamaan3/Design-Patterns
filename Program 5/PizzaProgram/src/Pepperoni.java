
public class Pepperoni extends ToppingDecorator{
	
	Pizza newPizza;
	public Pepperoni(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Pepperoni, ";
	}
	public double getCost() {
		return newPizza.getCost() + 2.0;
	}
}
