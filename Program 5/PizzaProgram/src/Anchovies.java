
public class Anchovies extends ToppingDecorator{
	
	Pizza newPizza;
	public Anchovies(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Anchovies, ";
	}
	public double getCost() {
		return newPizza.getCost();
	}
}
