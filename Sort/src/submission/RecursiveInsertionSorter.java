package submission;

public class RecursiveInsertionSorter {
	
	public static int[] sort(int[] unsorted) {
			sorter(unsorted,0,unsorted.length-1);
			return unsorted;
}
	
	public static int[] sorter(int[]unsorted, int first, int last){
		if(first<last){
			sorter(unsorted,first,last-1);
			insertinOrder(unsorted[last],unsorted,first,last-1);
	}	
		return unsorted;
	}
	
	public static int[] insertinOrder(int entry, int[]unsorted, int begin, int end){
		if(entry>=unsorted[end]){
			unsorted[end+1]=entry;
		}
		else if(begin<end){
			unsorted[end+1]=unsorted[end];
			insertinOrder(entry,unsorted,begin,end-1);
		}
		else{
			unsorted[end+1]=unsorted[end];
			unsorted[end]=entry;
		}
		return unsorted;
	}
}
