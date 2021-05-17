package DataStructures;

public class HeapTree {
	
	int max_size;
	int n;
	Integer tree[];
	
	public HeapTree(int init_max_size) {
		this.max_size = init_max_size;
		n = 0;
		tree = new Integer[max_size];
		for(int i=0;i<max_size;i++) tree[i] = null;
	}
	
	public void Insert_level_order(int item) {
		for(int i=1;i<max_size;i++) {
			if(tree[i] == null) {
				tree[i] = item;
				return;
			}
		}
		
		System.out.println("heap tree is full");
	}
	
	public void printtree() {
		printtree(1);
		System.out.println();
	}
	
	public void printtree(int id) {
		if(tree[id] != null) {
			System.out.print(tree[id]);
			if((tree[id*2] != null)||(tree[id*2+1]!=null)) {
				System.out.print("(");
				printtree(id*2);
				if(tree[id*2+1]!=null) System.out.print(" ");
				printtree(id*2+1);
				System.out.print(")");
			}
		}
	}
	
	public boolean Isempty() {
		return tree[1] == null; 
	}
}
