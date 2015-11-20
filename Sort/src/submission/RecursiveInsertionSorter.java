package submission;

public class RecursiveInsertionSorter {
	public static int[] sort(int[] unsorted) {
		int last=unsorted.length-1;
		if(unsorted[0]<unsorted[last]){
			last-=last;
			sort(unsorted);
			insertinOrder(unsorted[last],unsorted,unsorted[0],unsorted[last-1]);
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
