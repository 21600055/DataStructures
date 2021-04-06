package DataStructures;

public class Linked_Stack {

	private Node top;
	
	public Linked_Stack() {
		this.top = null;
	}
	
	public void Push(int item) {
		
		Node new_node = new Node(item);
		
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
			Node d = new Node();
			a = top.getData();
			d = top;
			top = top.link;
			d = null;
			System.out.println("pop된 것은 "+a+"입니다.");
			return a;
		}
	}
	
	public void Traverse() {
		Node cur = new Node();
		
		for(cur=top;cur!=null;cur=cur.link) {
			System.out.print(cur.getData()+" ");
		}
		System.out.println();
	}
	
	public boolean IsEmpty() {
		return (top==null?true:false);
	}
}
