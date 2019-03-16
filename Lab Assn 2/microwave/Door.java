package microwave;


class Door{
	private boolean isClosed = false;

	public void Open(){
		isClosed = false;
		System.out.println("Door is open");
	}

	public void Closed(){
		isClosed = true;
		System.out.println("Door is closed");
	}

	public boolean isClosed(){
		return isClosed;
	}
}