
public class CanadianBacon extends ToppingDecorator{
	
	Pizza newPizza;
	public CanadianBacon(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Canadian Bacon, ";
	}
	public double getCost() {
		return newPizza.getCost() + 2.75;
	}
}