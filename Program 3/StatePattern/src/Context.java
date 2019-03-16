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