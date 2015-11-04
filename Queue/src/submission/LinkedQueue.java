package submission;

import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode= new Node (newEntry, null);
		if (isEmpty())
			head=newNode;
		else
			tail.next=newNode;
		tail=newNode;
	}

	@Override
	public T dequeue() {
		T removal=head.data;
		head=head.next;
		return removal;
	}

	@Override
	public T peek() {
		return head.data;
	}

	@Override
	public boolean isEmpty() {
		return head==null && tail==null;
	}

	@Override
	public void clear() {
		head=null;
		tail=null;
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

	public static void main (String args[]){
		LinkedQueue q=new LinkedQueue();
		//Question!!! can't print empty queue, won't print if nothing there
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
		q.clear();
		//question!!! can't have print statement directly after clear, but still clears, but can't print cleared
		q.enqueue("CSCI230");
		System.out.println(q);
	}
}
