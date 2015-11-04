package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data=(T[]) new Object[5];
	private int head=0;
	private int tail=(5-1);
	
	@Override
	public void enqueue(T newEntry) {
		tail=(tail+1)% data.length;
		data[tail]=newEntry;
	}

	@Override
	public T dequeue() {
		T removed=data[head];
		data[head]=null;
		head=(head+1)%data.length;
		return removed;
	}

	@Override
	public T peek() {
		return data[head];
	}

	@Override
	public boolean isEmpty() {
		return head ==((tail+1)%data.length);
	}

	@Override
	public void clear() {
		head=0;
		tail=(data.length-1);
	}
	
	public String toString() {
		String s = data[head].toString();
		for (int i = head+1 % data.length; i >= 0; i--)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}
	
	public static void main(String args[]){
		ArrayQueue q=new ArrayQueue();
		//System.out.println(q);
		q.enqueue("Andrew");
		System.out.println(q);
		q.enqueue("Emily");
		System.out.println(q);
		q.enqueue("Nate");
		System.out.println(q);
		q.enqueue("Alexandra");
		System.out.println(q);
		q.enqueue("Vishnu");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.enqueue("Robert");
		System.out.println(q);
		q.enqueue("Hola");
		q.clear();
		System.out.println(q);
		q.enqueue("CSCI230");
		System.out.println(q);
	}
}