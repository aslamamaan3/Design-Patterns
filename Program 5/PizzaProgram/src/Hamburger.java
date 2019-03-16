
public class Hamburger extends ToppingDecorator{
	
	Pizza newPizza;
	public Hamburger(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Hamburger, ";
	}
	public double getCost() {
		return newPizza.getCost() + 2.0;
	}
}