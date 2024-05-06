package QueueFiles;

public class Queue {
    private int queue[] = new int[5];
	private int front = 0;
	private int rare = 0;
	private int size =0;
	public void enQueue(int data) {
		if(rare ==5) {
			System.out.println("Queue is fulled");
			return;
		}else {
			queue[rare] = data;
			rare++;
			size++;
		}
	}
	
	public int deQueue() {
		int value = 0;
		if(rare==0) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			value = queue[front];
			queue[front] = 0;
			front++;
			size--;
		}
		return value;
	}
	
	public void show() {
		for(int data : queue) {
			System.out.print(data+" ");
		}
		System.out.println();
	}
	public int size() {
		return size;
	}
}
