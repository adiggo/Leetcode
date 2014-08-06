
public class MergerSort{
	void mergeSort(int[] array){
		int[] helper = new int[array.length];
		mergeSort(array, helper, 0, array.length-1);
	}
	void mergeSort(int[] array, int[] helper, int start, int end){
		if (start<end){
			int middle = (start+end)/2;
			mergeSort(array, helper, start, mid);
			mergerSort(array, helper, mid+1, end);
			merge(array, helper, start, mid, end);
		}
	}
	void merge(int[] array, int[] helper,  int start, int middle, int end){
		for (i = start; i<=end; i++){
			helper[i]= array[i];
		}
		
		int helperLeft = start;
		int helperRight = middle+1;
		int current = start;
        //condition to check
        // less or equal, decided by length-1
        while(helperLeft<=middle && helperRight <= end){
			if (helper[helperLeft]<= helper[helperRight]){
				array[current] = array[helperLeft];
				helperLeft++;
			}
			else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		

		// to deal the left elements
		int remain = middle - helperLeft;
		for (int i = 0; i<=remain; i++){
			array[current+i] = helper[helpLeft+i];
		}
	}
}
