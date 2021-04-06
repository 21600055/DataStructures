package DataStructures;

public class Main {
	
	public static void main(String args[]) {
		
		Main m = new Main();
		//m.runLinkedQueue();
		m.runTree();
	}
	
	public void runStack() { // 스택 예제
		Stack s1 = new Stack(5);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.visualize();
		s1.pop();
		s1.visualize();
		
		s1 = new Stack(10);
		s1.push(5);
		s1.pop();
		s1.pop();
		s1.visualize();
	}
	
	public void runQueue() { // 큐 예제
		
		Queue q1 = new Queue(5);
		q1.Enqueue(1);
		q1.Enqueue(2);
		q1.Enqueue(3);
		q1.Visualize();
		q1.Dequeue();
		q1.Visualize();
		
	}
	
	public void runLinkedlist() {
		
		Linked_List l1 = new Linked_List();
		l1.Insert(1);
		l1.Insert(2);
		l1.Insert(3);
		l1.Traverse();
		l1.Delete(2);
		l1.Traverse();
		l1.Insert_before(1,2);
		l1.Traverse();
		l1.Insert_before(3,6);
		l1.Traverse();
		l1.Insert_before(8,7);
		l1.Traverse();
		l1.Insert_after(3,9);
		l1.Traverse();
		l1.Invert();
		l1.Traverse();
		l1.Delete();
		l1.Traverse();
	}
	
	public void runLinkedStack() {
		
		Linked_Stack ls1 = new Linked_Stack();
		ls1.Push(1);
		ls1.Push(2);
		ls1.Push(3);
		ls1.Push(4);
		ls1.Traverse();
		ls1.Pop();
		ls1.Pop();
		ls1.Traverse();
	}
	
	public void runLinkedQueue() {
		
		Linked_Queue lq1 = new Linked_Queue();
		lq1.Enqueue(1);
		lq1.Enqueue(2);
		lq1.Enqueue(3);
		lq1.Traverse();
		lq1.Dequeue();
		lq1.Traverse();
		lq1.Dequeue();
		lq1.Traverse();
		lq1.Dequeue();
		lq1.Traverse();
	}
	
	public void runTree() {
		
		Tree t1 = new Tree();
		for(int i=1;i<=7;i++) {
			t1.Insert_level_order(i);
		}
		t1.TraverseInorder();
		t1.TraversePreorder();
		t1.TraversePostorder();
	}
	
}
