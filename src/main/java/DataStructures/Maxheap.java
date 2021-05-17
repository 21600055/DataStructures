package DataStructures;

public class Maxheap extends HeapTree{
	
	public Maxheap(int init_max_size) {
		super(init_max_size);
	}
	
	public void Insert_max_heap(int item) {
		
		if(super.n>=super.max_size) {
			System.out.println("heap is full"); 
			return;
		}
		
		int i = ++super.n;
		while((i>1) && (item>super.tree[i/2])) {
			super.tree[i]  = super.tree[i/2];
			i /= 2;
		}
		super.tree[i] = item; 
	}
	
	public int Delete_max_heap() {
		
		Integer item = null;
		
		item = super.tree[1];
		super.tree[1] = super.tree[n];
		super.tree[n] = null;
		super.n--;
		int parent = 1,lindex;
		
		while(parent*2<=n) {
			
			if(super.tree[parent*2+1]!=null) {
				lindex = super.tree[parent*2]>super.tree[parent*2+1] ? parent*2 : parent*2+1;
			} else {
				lindex = parent*2;
			}
			
			if(super.tree[parent]>=super.tree[lindex]) break;
			
			swap(parent,lindex);
			parent = lindex;
		}
		return item.intValue(); 
	}
	
	public void swap(int parent,int lindex) {
		int temp;
		temp = super.tree[parent];
		super.tree[parent] = super.tree[lindex];
		super.tree[lindex] = temp;
	}
}
