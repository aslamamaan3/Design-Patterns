
public class BlackOlives extends ToppingDecorator{
	
	Pizza newPizza;
	public BlackOlives(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Black Olives, ";
	}
	public double getCost() {
		return newPizza.getCost() + 1.50;
	}
}
