package Task2;

public class MergeSort {
	// sort by descending order
	public static void mergeSort(int[] array) {
	    if (array == null) {
	        return;
	    }
	    int length = array.length;
	    if (length <= 1) {
	        return;
	    }
	    int middle = length / 2;
	    int[] leftArr = new int[middle];
	    int[] rightArr = new int[length - middle];

	 // chia
	    for (int i = 0; i < middle; i++) {
	    	leftArr[i] = array[i];
	    }
	    for (int i = middle; i < length; i++) {
	    	rightArr[i - middle] = array[i];
	    }

	    
	    mergeSort(leftArr);
	    mergeSort(rightArr);

	    
	    merge(array, leftArr, rightArr);
	}

	 private static void merge(int[] arr, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < left.length) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < right.length) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
		
	}
	
	public static void main(String[] args) {
		int[]arr = {9,8,7,6,5,4,3,2};
		  mergeSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
