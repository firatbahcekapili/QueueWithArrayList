
public class Test {

	public static void main(String[] args) {
	
		
		MyQueue a= new MyQueue();
		
		a.enqueue("a");
		a.enqueue("5");
		a.enqueue("22");
		a.enqueue("61");
		a.enqueue("F�rat");
		
		a.dequeue();
		a.dequeue();
		
		a.showQueue();
		
		System.out.println("Kuyru�un son eleman� : "+a.peek());
		
		System.out.println("Kuyruk bo� mu? : "+a.isEmpty());
		
		System.out.println("Kuyru�un boyu ne kadar? : "+a.queueSize());
		
		
	}

}
