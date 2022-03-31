
public class Test {

	public static void main(String[] args) {
	
		
		MyQueue a= new MyQueue();
		
		a.enqueue("a");
		a.enqueue("5");
		a.enqueue("22");
		a.enqueue("61");
		a.enqueue("Fýrat");
		
		a.dequeue();
		a.dequeue();
		
		a.showQueue();
		
		System.out.println("Kuyruðun son elemaný : "+a.peek());
		
		System.out.println("Kuyruk boþ mu? : "+a.isEmpty());
		
		System.out.println("Kuyruðun boyu ne kadar? : "+a.queueSize());
		
		
	}

}
