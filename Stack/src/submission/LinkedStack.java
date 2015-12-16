package submission;

import adt.Stack;
//import src.LinkedStack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	@Override
	public void push(T newEntry) {
		top=new Node(newEntry, top);
	}

	@Override
	public T pop() {
		if(!isEmpty()){
		T entry=top.data;
		top=top.next;
		return entry;
		}
		return null;
	}

	@Override
	public T peek() {
		if (isEmpty())
			return null;
		else
			return top.data;
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}

	@Override
	public void clear() {
		top=null;
		
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
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

	public static void main(String[] args) {
		LinkedStack s =new LinkedStack();
		System.out.println(s);
		s.push("Nikita");
		System.out.println(s);
		s.push("Alexandra");
		System.out.println(s);
		s.push("Emily");
		System.out.println(s);
		s.push("Andrew");
		System.out.println(s);
		s.push("Nate");
		System.out.println(s);
		s.push(s.peek());
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.clear();
		System.out.println(s);
		s.push("Nikita");
		s.push("Alexandra");
		s.push("Emily");
		System.out.println(s);
}
}
