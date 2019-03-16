
public class Sausage extends ToppingDecorator{
	
	Pizza newPizza;
	public Sausage(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Sausage, ";
	}
	public double getCost() {
		return newPizza.getCost() + 2.0;
	}
}