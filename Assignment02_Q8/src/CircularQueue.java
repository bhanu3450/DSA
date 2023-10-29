
public class CircularQueue {
	private int[] arr;
	private int front, rear;
	private int SIZE;
	private int count;

	public CircularQueue(int size) {
		this.SIZE = size;
		this.arr = new int[SIZE];
		this.front = -1;
		this.rear = -1;
		count = 0;
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
		count++;
	}

	public void pop() {
		front = (front + 1) % SIZE;
		count--;
		if (front == rear)
			front = rear = -1;
	}
	
	public int getCount() {
		return count;
	}

	public int peek() {
		return arr[(front + 1) % SIZE];
	}

	public boolean isFull() {
		return (front == rear && rear != -1) || (rear == SIZE - 1 && front == -1);
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

}
