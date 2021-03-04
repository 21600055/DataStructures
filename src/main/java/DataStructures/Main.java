package DataStructures;

public class Main {
	
	public static void main(String args[]) {
		
		Main m = new Main();
		m.runQueue();;
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
	
}
