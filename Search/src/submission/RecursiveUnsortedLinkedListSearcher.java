package submission;

public class RecursiveUnsortedLinkedListSearcher {
	static boolean result;
	public static boolean search(Node a, int key) {
		if(a.getNum()==key){
			result=true;
		}
		else if(a.getNext()!=null){
			search(a.getNext(),key);
		}
		else{
			result=false;
		}
		return result;
	}
}
