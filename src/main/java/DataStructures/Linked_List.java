package DataStructures;

class Node { // C,C++에서의 struct를 대신할 노드 class
	
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

public class Linked_List {
	
	private Node head;
	
	public Linked_List() {
		this.head = null;
	}
	
	public void Insert(int item) { // 맨 끝에 삽입
		
		Node new_node = new Node(item);
		
		if(Isempty()) {
			head = new_node;
		} else {
			Node cur = new Node();
			Node prev = new Node();
			for(cur = head;cur!=null;prev=cur,cur=cur.link);
			prev.link = new_node;
		}
	}
	
	public void Insert_before(int old, int item) { // old 값 이전에 item 삽입
		
		Node cur = new Node();
		Node prev = new Node();
		Node new_node = new Node(item);
		
		for(cur=head;cur!=null; prev=cur,cur=cur.link) {
			if(cur.getData()==old) break;
		}
		
		if(cur == null){ // old가 없는 경우, 맨끝에 삽입
			this.Insert(item);
		} else if(cur.getData() == head.getData()) { // head 이전에 삽입 할때 
			new_node.link = head;
			head = new_node;
		} else if(cur!=null){  // 그 이외의 경우, 중간에 넣는다던가
			new_node.link = prev.link;
			prev.link = new_node;
		}
	}
	
	public void Insert_after(int old, int item) { //old 값 이후에 item 삽입
		
		Node cur = new Node();
		Node new_node = new Node(item);
		
		for(cur=head;cur!=null;cur=cur.link) {
			if(cur.getData()==old) break;
		}
		
		if(cur==null) {
			this.Insert(item);
		} else {
			new_node.link = cur.link;
			cur.link = new_node;
		}
	}
	
	public void Delete(int item) { //특정 item 삭제
		
		Node prev = new Node();
		Node cur = new Node();
		cur = head;
		
		while(cur!=null && cur.getData()!=item) {
			prev = cur;
			cur = cur.link;
		}
		
		if(cur!=null) {
			if(cur==head) {
				head = cur.link;
			} else {
				prev.link = cur.link;
			}
			cur = null;
		} else {
			System.out.println("삭제할 것이 없습니다.");
		}
	}
	
	public void Delete() { //맨끝에 삭제
		
		if(Isempty()) {
			System.out.println("리스트가 존재하지 않습니다.");
		} else {
			Node cur = new Node();
			Node prev = new Node();
			for(cur=head;cur.link!=null;prev=cur,cur=cur.link); 
			prev.link=null;
			cur = null;
		}
	}
	
	public boolean Isempty() {
		return (head == null?true:false);
	}
	
	public void Find_nth(int n) { // n번째 데이터값 찾기
		
		Node cur = new Node();
		
		int i;
		for(cur = head,i=1;cur!=null&&i<n;cur=cur.link,i++) {
			if(i==n) break;
		}

		if(cur!=null) {
			System.out.println(n+"번째 값은 "+cur.getData()+"입니다.");
		} else {
			System.out.println(n+"번째 값은 없습니다!");
		}
	}
	
	public void Size() {
		
		Node cur = new Node();
		
		int i;
		for(cur=head,i=0;cur!=null;cur=cur.link,i++);
		
		System.out.println("리스트 크기는 "+i+"입니다.");
	}
	
	public void Traverse() { //링크드리스트 순회
		
		Node cur = new Node();
		
		for(cur=head;cur!=null;cur=cur.link) {
			System.out.print(cur.getData()+" ");
		}
		System.out.println();
	}
	
	public void Invert() {
		
		Node cur = new Node();
		Node prev = new Node();
		Node next = new Node();
		cur = head;
		
		while(cur!=null) {
			next = cur.link;
			cur.link = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		this.Delete(0);
	}
}
