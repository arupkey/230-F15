package submission;

import java.util.Arrays;

import adt.Stack;
//import src.ArrayStack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data=(T[])new Object[20];
	private int top=-1;
	
	
	@Override
	public void push(T newEntry) {
		if(top+1==data.length){
			int newlength=2*data.length;
			data= Arrays.copyOf(data, newlength);
		}
			data[top+1]=newEntry;
			top++;
		
	}
	//test

	@Override
	public T pop() {
		T entry=data[top];	
		data[top]=null;
		top--;
		return entry;
	}

	@Override
	public T peek() {
		if (isEmpty())
			return null;
		else
			return data[top];
	}

	@Override
	public boolean isEmpty() {
		return top<0;
	}

	@Override
	public void clear() {
		while (top!=-1){
			T pop;
		}
		
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}

	public static void main(String[] args) {
		ArrayStack s =new ArrayStack();
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
		s.push("Andrew");
		System.out.println(s);
	}
}
