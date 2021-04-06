package DataStructures;

class Treenode extends Node{ //tree 전용 node 
	
	public Treenode left,right;
	
	public Treenode(int item) {
		super(item);
		this.left = null;
		this.right = null;
	}
	
	public Treenode() {
		super();
	}
}

class Listnode { //Treenode 타입  Linked queue node
	
	Treenode data;
	Listnode link;
	
	public Listnode(Treenode item) {
		this.data = item;
		this.link = null;
	}

	public Treenode getData() {
		return this.data;
	}
}

class Linkedqueue {
	
	private Listnode front;
	private Listnode rear;
	
	public Linkedqueue() {
		this.front = null;
		this.rear = null;
	}

	public void Enqueue(Treenode item) {
		
		Listnode new_node = new Listnode(item);
		if(rear!=null) {
			rear.link = new_node;
		}
		rear = new_node;
		if(front==null) {
			front = rear;
		}
	}

	public Treenode Dequeue() {
		
		Treenode returnitem;
		Listnode deletenode;
		
		if(Isempty()) {
			System.out.println("비었습니다.");
			return null;
		}
		
		returnitem = this.getFront().getData();
		deletenode = front;
		front = front.link;
		deletenode = null;
		
		return returnitem;
	}

	public boolean Isempty() {
		return (this.front==null);
	}

	public Listnode getFront() {
		return this.front;
	}
}

public class Tree{ //tree class
	
	Treenode root;
	
	public Tree() {
		this.root = null;
	}
	
	public boolean Isempty() {
		return (this.root==null);
	}
	
	public void Insert_level_order(int item) {
		
		Treenode new_tree_node = new Treenode(item);
		
		if(Isempty()) {
			root = new_tree_node;
			return;
		}
		
		Linkedqueue q = new Linkedqueue();
		q.Enqueue(this.root);
		
		while(!(q.Isempty())) {
			Treenode temp = q.Dequeue();
			
			if(temp.left == null) {
				temp.left = new_tree_node;
				break;
			} else {
				q.Enqueue(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new_tree_node;
				break;
			} else {
				q.Enqueue(temp.right);
			}
		}
	}
	
	public void TraverseInorder() {
		System.out.println("Inorder traverse");
		System.out.print("[");
		TraverseInorder(this.root);
		System.out.println("]");
	}
	
	public void TraverseInorder(Treenode ptr) {
		if(ptr!=null) {
			TraverseInorder(ptr.left);
			System.out.print(" "+ptr.getData()+" ");
			TraverseInorder(ptr.right);
		}
	}
	
	public void TraversePreorder() {
		System.out.println("pre order traverse");
		System.out.print("[");
		TraversePreorder(this.root);
		System.out.println("]");
	}
	
	public void TraversePreorder(Treenode ptr) {
		if(ptr!=null) {
			System.out.print(" "+ptr.getData()+" ");
			TraversePreorder(ptr.left);
			TraversePreorder(ptr.right);
		}
	}
	
	public void TraversePostorder() {
		System.out.println("post order traverse");
		System.out.print("[");
		TraversePostorder(this.root);
		System.out.println("]");
	}
	
	public void TraversePostorder(Treenode ptr) {
		if(ptr!=null) {
			TraversePostorder(ptr.left);
			TraversePostorder(ptr.right);
			System.out.print(" "+ptr.getData()+" ");
		}
	}
}
