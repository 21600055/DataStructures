package DataStructures;

class Qnode { // C,C++에서의 struct를 대신할 노드 class
	
	private int data;
	public Qnode link;
	
	public Qnode() {
		this.data = 0x00;
		this.link = null;
	}
	
	public Qnode(int item) {
		this.data = item;
		this.link = null;
	}
	
	public int getData() {
		return this.data;
	}
}

public class Linked_Queue {
	
	private Qnode front;
	private Qnode rear;
	
	public Linked_Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public void Enqueue(int item) {
		
		Qnode new_node = new Qnode(item);
		new_node.link = null;
		
		if(rear!=null) {
			rear.link = new_node;
		} else {
			front = new_node;
		}
		rear = new_node;
	}
	
	public int Dequeue() {
		
		int a;
		
		if(Isempty()) {
			System.out.println("비었습니다.");
			return 0x00;
		} else {
			Qnode d = new Qnode();
			a = front.getData();
			d = front;
			front = front.link;
			d = null;
			System.out.println("Dequeue 된것은 "+a+"입니다.");
			return a;
		}
	}
	
	public void Traverse() {
		
		Qnode cur = new Qnode();
		
		for(cur=front;cur!=null;cur=cur.link) {
			System.out.print(cur.getData()+" ");
		}
		System.out.println();
	}
	
	public boolean Isempty() {
		return (front==null?true:false);
	}
}
