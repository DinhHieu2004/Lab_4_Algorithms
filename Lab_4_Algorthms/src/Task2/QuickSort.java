package Task2;


import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10, 30,80, 90, 40, 50, 70 };

		
//		System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(arr));
//		quickSort(arr, 0, arr.length - 1);
	//	partition(arr, 0, arr.length - 1);
	//	quickSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
	public static void quickSort(int[]arr) {
		 quickSort(arr,0,arr.length-1);
	}

	public static void quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		} else {
			int k = partition(arr, l, r);
			System.out.println("l= "+ l +"  r= "+r);
			 System.out.println( "ket qua qr: "+ Arrays.toString(arr));
			quickSort(arr,l,k-1);
			
			quickSort(arr,k+1,r);
		}
	}
	static int partition(int arr[], int low, int high) {
		int pivot =getPivotLastArray(arr);
		int i = (low - 1); 
		for (int j = low; j < high; j++) {
			
			
			if (arr[j] < pivot) {
				i++;

				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
	private static int getPivotLastArray(int[]arr) {
		return arr[arr.length-1];
	}

}
