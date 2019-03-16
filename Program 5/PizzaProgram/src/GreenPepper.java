
public class GreenPepper extends ToppingDecorator{
	
	Pizza newPizza;
	public GreenPepper(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Green Pepper, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.0;
	}
}