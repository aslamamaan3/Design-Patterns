import java.util.Scanner;

public class PizzaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Pizza Size 1, 2 ,3 or 4 or x to exit");
			
			String x = sc.nextLine();
			if(x.equals("x") || x.equals("X") ) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else {
				int pizzaSize = Integer.parseInt(x);
				
				Factory factory = new Factory();
				Pizza pizza;
				pizza = factory.baseSize(pizzaSize);
				
				System.out.println("Enter Toppings");
				//System.out.println("Enter Toppings:\n(P)epperoni, $2.00\n(S)ausage, $2.00\n(H)amburger, $2.0\n(C)anadian Bacon, $2.7\n(E)xtra cheese, $1.8\n(O)nions, $1.50\n(G)reen Pepper, $1.5\n(B)lack olives, $1.50\nGree(n) olives, $1.35\n(M)ushrooms, $1.7\n(A)nchovies, Free\nBee(r), $3.25");
				
				x = sc.nextLine();
				for(int i =0; i<x.length(); i++) {
					switch(x.charAt(i)) {
					case 'p':
					case 'P':	
						pizza = new Pepperoni(pizza);
						break;
					case 's':	
					case 'S':
						pizza = new Sausage(pizza);
						break;
					case 'h':
					case 'H':
						pizza = new Hamburger(pizza);
						break;
					case 'c':
					case 'C':
						pizza = new CanadianBacon(pizza);
						break;
					case 'e':
					case 'E':
						pizza = new ExtraCheese(pizza);
						break;
					case 'o':
					case 'O':
						pizza = new Onions(pizza);
						break;
					case 'g':
					case 'G':
						pizza = new GreenPepper(pizza);
						break;
					case 'b':
					case 'B':
						pizza = new BlackOlives(pizza);
						break;
					case 'n':
					case 'N':
						pizza = new GreenOlives(pizza);
						break;
					case 'm':
					case 'M':
						pizza = new Mushrooms(pizza);
						break;
					case 'a':
					case 'A':
						pizza = new Anchovies(pizza);
						break;
					case 'r':
					case 'R':
						pizza = new Beer(pizza);
						break;
					
					}
					
				}
				System.out.println("Order: "+pizza.getDesc()+"- "+pizza.getCost()+"\n	"+x.length()+" ingredients\nEnd Order");
			
			}
		}
		
		
		
		
	
	}

}

