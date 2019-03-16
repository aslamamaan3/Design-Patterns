
public class Factory {
	Pizza baseSize(int pizzaSize) {
		
		switch(pizzaSize) {
		case 1:
			return new Small();
		case 2:
			return new Medium();
		case 3:
			return new Large();
		case 4:
			return new Family();
		default:
			return new Small();
		}
	}
}
