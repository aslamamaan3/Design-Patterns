import java.util.*;

interface State{
	public void nextState(Context ctx, char inputchar);
}

class State1 implements State{

	public void nextState(Context ctx, char inputchar){
		if(inputchar == 'a'){
			ctx.setState(new State3());
		}
		else if(inputchar == 'b'){
			ctx.setState(new State2());
		}
		else if(inputchar != 'a' || inputchar != 'b'){
			ctx.setState(new InvalidInputState());
		}

	}
}

class State2 implements State{

	public void nextState(Context ctx, char inputchar){
		if(inputchar == 'a'){
			ctx.setState(new State4());
		}
		else if(inputchar == 'b'){
			ctx.setState(new State1());
		}
		else if(inputchar != 'a' || inputchar != 'b'){
			ctx.setState(new InvalidInputState());
		}

	}
}



class State3 implements State{

	public void nextState(Context ctx, char inputchar){
		if(inputchar == 'a'){
			ctx.setState(new State1());
		}
		else if(inputchar == 'b'){
			ctx.setState(new State4());
		}
		else if(inputchar != 'a' || inputchar != 'b'){
			ctx.setState(new InvalidInputState());
		}

	}
}

class State4 implements State{

	public void nextState(Context ctx, char inputchar){
		if(inputchar == 'a'){
			ctx.setState(new State2());
		}
		else if(inputchar == 'b'){
			ctx.setState(new State3());
		}
		else if(inputchar != 'a' || inputchar != 'b'){
			ctx.setState(new InvalidInputState());
		}

	}
}

class InvalidInputState implements State{
	public void nextState(Context ctx, char inputchar){}

}


class Context{

	private State currentState;

	public Context(){
		currentState = new State1();
	}

	public void setState(State s){
		currentState = s;
	}

	public void stateTransition(String str){
		String input = str;
		char inputchar;
		for(int i = 0 ; i < str.length(); i++){
			inputchar = str.charAt(i);
			currentState.nextState(this, inputchar);
		}
		
	}

	public boolean isAccepted(){
		if(currentState instanceof State1){
			return true;
		}
		else
			return false;
	}
	
}



class StatePattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Context context;
		String str;

		while(true){
			System.out.print("Enter String>");
			str = sc.nextLine();
			if(str.length()!=0){
				context = new Context();
				if(str.equals("q")){
					System.out.println("Goodbye!");
					break;
				}
				else{
					context.stateTransition(str);

					if(context.isAccepted()){
						System.out.println("String " +str+ " accepted");
						continue;
				}
					else{
						System.out.println("String " +str+ " not accepted");
						continue;
					}
				}
			}

			

		}
	}
}



