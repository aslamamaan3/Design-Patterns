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