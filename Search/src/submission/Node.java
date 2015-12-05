package submission;

public class Node {
	  private int  num; // Entry in bag
	  private Node next; // Link to next node

		public Node(int i)
		{
			this(i, null);	
		} // end constructor
		
		public Node(int i, Node nextNode)
		{
			setNum(i);
			setNext(nextNode);	
		} // end constructor

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
}
