package DataStructures;

public class Stack {
	
	private int top;
	private int capacity;
	private int stack[];
	
	public Stack(int n) { //constructor
		this.top = -1;
		this.capacity = n;
		this.stack = new int[this.capacity];
	}
	
	public void push(int item) { 
		if(Isfull())
			System.out.println("Stack is full");
		else
			stack[++top] = item;
	}
	
	public int pop() {
		if(IsEmpty()) {
			System.out.println("Stack is  empty");
			return 0x00; //null return
		} else {
			return stack[top--];
		}
	}
	
	public boolean IsEmpty() {
		if(top==-1) return true;
		else return false;
	}
	
	public boolean Isfull() {
		if(top==capacity-1) return true;
		else return false;
	}

	public int getTop() {
		return top;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void visualize() {
		System.out.println("top = "+top);
		for(int i=0;i<=top;i++) System.out.println(stack[i]);
	}
	
}
