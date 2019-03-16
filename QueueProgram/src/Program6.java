
public class Program6 {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		
		Thread p = new Thread(new Producer(q));
		Thread c = new Thread(new Consumer(q));
		
		p.start();
		c.start();
	}

}
