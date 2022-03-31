import java.util.ArrayList;

public class MyQueue {

	public int tail;
	public int head = 0;

	public MyQueue() {

	}

	ArrayList<Object> queue = new ArrayList<>();

	public void enqueue(String string) {
		queue.add(string);
		tail = queue.size();
	}

	public void dequeue() {

		queue.remove(0);
		tail = queue.size();

	}

	public void showQueue() {
		System.out.println(queue);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int queueSize() {
		return queue.size();

	}
	public String peek() {
	
		return queue.get(tail-1).toString();
	}

}
