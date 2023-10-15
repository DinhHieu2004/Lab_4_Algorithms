package Task2;

import java.util.Random;

public class QuickSorts {

	public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
       // int pivotIndex = getPivot_MedianOfThree(array, low, high);
    	int pivotIndex = getPivot_First(array, low, high);
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivotValue) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static int getPivot_MedianOfThree(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        if (array[low] > array[mid]) {
            swap(array, low, mid);
        }
        if (array[low] > array[high]) {
            swap(array, low, high);
        }
        if (array[mid] > array[high]) {
            swap(array, mid, high);
        }
        return mid;
    }

    private static int getPivot_First(int[] array, int low, int high) {
        return low;
    }

    private static int getPivot_Last(int[] array, int low, int high) {
        return high;
    }

    private static int getPivot_Random(int[] array, int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }


	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[]arr= {5,6,3,2,1,9,7,5};
		quickSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
