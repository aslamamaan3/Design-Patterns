
public class GreenOlives extends ToppingDecorator{
	
	Pizza newPizza;
	public GreenOlives(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "GreenOlives, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.35;
	}
}
