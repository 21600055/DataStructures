package DataStructures;

public class Node { // C,C++에서의 struct를 대신할 노드 class
	private int data;
	public Node link;
	
	public Node() {
		this.data = 0x00;
		this.link = null;
	}
	
	public Node(int item) {
		this.data = item;
		this.link = null;
	}
	
	public int getData() {
		return this.data;
	}
}
