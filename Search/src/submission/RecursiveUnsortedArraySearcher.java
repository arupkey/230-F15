package submission;

public class RecursiveUnsortedArraySearcher {
	static int indexvalue=230;
	public static int search(int[] a, int key) {
		return search(a, key, a.length-1); // Don't touch
	}
	
	// TODO: Implement this one
	private static int search(int[] a, int key, int endIndex) {
		
		if(endIndex==-1){
			indexvalue=-1;
		}
		
		else if(a[endIndex]==key){
			indexvalue=endIndex;
		}
		
		else{
			search(a,key,endIndex-1);
		}
		
		return indexvalue;
	}
}
