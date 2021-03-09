package DataStructures;

class Snode { // C,C++에서의 struct를 대신할 노드 class
	
	private int data;
	public Snode link;
	
	public Snode() {
		this.data = 0x00;
		this.link = null;
	}
	
	public Snode(int item) {
		this.data = item;
		this.link = null;
	}
	
	public int getData() {
		return this.data;
	}
}

public class Linked_Stack {

	private Snode top;
	
	public Linked_Stack() {
		this.top = null;
	}
	
	public void Push(int item) {
		
		Snode new_node = new Snode(item);
		
		if(IsEmpty()) {
			top = new_node;
		} else {
			new_node.link = top;
			top = new_node;
		}
	}
	
	public int Pop() {
		
		int a;
		if(IsEmpty()) {
			System.out.println("비었습니다.");
			return 0x00;
		} else {
			Snode d = new Snode();
			a = top.getData();
			d = top;
			top = top.link;
			d = null;
			System.out.println("pop된 것은 "+a+"입니다.");
			return a;
		}
	}
	
	public void Traverse() {
		Snode cur = new Snode();
		
		for(cur=top;cur!=null;cur=cur.link) {
			System.out.print(cur.getData()+" ");
		}
		System.out.println();
	}
	
	public boolean IsEmpty() {
		return (top==null?true:false);
	}
}
