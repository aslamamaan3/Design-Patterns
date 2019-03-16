

public class MyQueue {
	
	static int count = 0;
	QElement front, rear;	
	public MyQueue() {
		this.front = this.rear = null;
	}
	
	public synchronized void add(String s) {
		
		QElement elem = new QElement(s);
		
		while(count==10) {
			try {
				System.out.println("Waiting on dequeue...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(this.rear == null) {
			count ++;
			this.front = this.rear = elem;
			System.out.println("Enqueuing "+s+" nodeCount = "+count);
			
		}
		else{
			count ++;
			this.rear.next = elem;
			this.rear = elem;
			System.out.println("Enqueuing "+s+" nodeCount = "+count);
			
		}
		notifyAll();

	}
	
	
	
	public synchronized void remove() {
		
		while(this.front==null) {
			try {
				System.out.println("Waiting on Enqueue...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		QElement elem = this.front;
		this.front = this.front.next;
		System.out.println("Dequeuing "+elem.getData()+" nodeCount = "+ count);
		
		
		if(this.front == null) {
			count = 0;
			this.rear = null;
			//System.out.println("Dequeuing "+elem.getData()+" nodeCount = "+ count);
			
		}
		notifyAll();
	}
	
}
