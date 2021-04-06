package DataStructures;

public class Linked_Queue {

	private Node front;
	private Node rear;
	
	public Linked_Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public void Enqueue(int item) {
		
		Node new_node = new Node(item);
		new_node.link = null;
		
		if(rear!=null) {
			rear.link = new_node;
		}
		rear = new_node;
		if(front==null) {
			front = rear;
		}
	}
	
	public int Dequeue() {
		
		int a;
		
		if(Isempty()) {
			System.out.println("비었습니다.");
			return 0x00;
		} else {
			Node d = new Node();
			a = front.getData();
			d = front;
			front = front.link;
			d = null;
			System.out.println("Dequeue 된것은 "+a+"입니다.");
			return a;
		}
	}
	
	public void Traverse() {
		
		Node cur = new Node();
		
		for(cur=front;cur!=null;cur=cur.link) {
			System.out.print(cur.getData()+" ");
		}
		System.out.println();
	}
	
	public boolean Isempty() {
		return (front==null?true:false);
	}
}
