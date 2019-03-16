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