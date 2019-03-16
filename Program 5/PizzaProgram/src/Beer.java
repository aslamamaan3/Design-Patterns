
public class Beer extends ToppingDecorator{
	
	Pizza newPizza;
	public Beer(Pizza piz) {
		newPizza = piz;
	}
	
	public String getDesc() {
		return newPizza.getDesc() + "Beer, ";
	}
	public double getCost() {
		return newPizza.getCost() + 3.25;
	}
}
