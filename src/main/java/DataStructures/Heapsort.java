package DataStructures;

public class Heapsort {
	
	private int size;
	private int temp[];
	
	public Heapsort(int a[]) {
		this.size = a.length;
		temp = new int[size];
		sort(a);
	}
	
	public void sort(int a[]) {
		Maxheap m1 = new Maxheap(size+1);
		for(int i=0;i<size;i++) m1.Insert_max_heap(a[i]);
		for(int i=0;i<size;i++) temp[i] = m1.Delete_max_heap();
	}
	
	public int[] gettemp(){
		return temp;
	}
}
