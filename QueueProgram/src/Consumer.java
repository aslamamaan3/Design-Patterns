import java.util.Random;

public class Consumer implements Runnable {
	
	public MyQueue q;
	public Consumer(MyQueue queue) {
		this.q = queue;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<50; i++) {
			try {
				Random random = new Random();
		        int myRandomNumber = random.nextInt(3000 - 1000) + 1000;
				Thread.sleep(myRandomNumber);
				q.remove();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Dequeued 50 items");
		
	}

}
