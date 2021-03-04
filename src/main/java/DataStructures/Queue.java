package DataStructures;

public class Queue {
	
	private int front;
	private int rear;
	private int capacity;
	private int queue[];
	
	public Queue(int n){ //constructor
		this.front = 0;
		this.rear = 0;
		this.capacity = n;
		this.queue = new int[this.capacity];
	}
	
	public void Enqueue(int item) {
		
		if(Isfull()) {
			System.out.println("Queue is full");
		} else {
			rear = (rear+1)%capacity;
			queue[rear] = item;
		}
	}
	
	public int Dequeue() {
		
		if(Isempty()) {
			System.out.println("Queue is Empty");
			return 0x00;
		} else {
			front = (front+1)%capacity;
			return queue[front];
		}
	}
	
	public boolean Isfull() {
		return (rear+1)%capacity == front;
	}
	
	public boolean Isempty() {
		return (front == rear);
	}

	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void Visualize() {
		System.out.println("front = "+ front);
		System.out.println("rear = "+ rear);
		
		if(front <= rear) {
			for(int i=front+1;i<=rear;i++) System.out.print(queue[i]+" ");
			System.out.println();
		} else {
			for(int i=front+1;i<capacity;i++) System.out.print(queue[i]+" ");
			for(int i=0;i<=rear;i++) System.out.print(queue[i]+" ");
			System.out.println();
		}
	}
}