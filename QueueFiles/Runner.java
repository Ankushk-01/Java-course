package QueueFiles;


public class Runner {
    public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.show();
		int value = queue.deQueue();
		System.out.println("value : "+value);
		queue.deQueue();
		queue.show();
		queue.enQueue(3);
		queue.enQueue(4);
		queue.show();
		queue.enQueue(5);
		queue.enQueue(6);
		queue.show();
	}
}
