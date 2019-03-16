import java.util.Date;
import java.util.Random;

public class Producer implements Runnable {
	
	public MyQueue q;
	public Producer(MyQueue queue) {
		this.q = queue;
	}
	@Override
	public void run() {
		
		for(int i=0; i<50; i++) {
			
			try {
				String s = new Date().toString();
				q.add(s);
				System.out.println("Processing #"+(i+1));
				Random random = new Random();
		        int myRandomNumber = random.nextInt(1000 - 800) + 800;
				Thread.sleep(myRandomNumber);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
				
				
	
		
	}
		
	
		
}
