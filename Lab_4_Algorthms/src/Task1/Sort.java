package Task1;

public class Sort {
	
	public static void selectionSort(int[] array) {
		int len = array.length;
		
		for(int i=0; i<len-1;i++) {
			int k=i;
			
			for(int j=i+1;j<len;j++) {
				if(array[j]<array[k]) {
					k = j; 
				}
			}
			swap(array,k,i);
		}
		display(array);
		
	}
	public static void display(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void insertionSort(int []arr) {
		int len= arr.length;
		for(int i=1;i<len;i++) {
			int current = arr[i];
			int j = i;
			while(j>0&& arr[j-1]>current) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=current;
		}
		display(arr);
	}
	public static void bubbleSort(int arr[]) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		display(arr);
	}
	public static void main(String[] args) {
		int[] arr = {2,1,4,3};
		//selectionSort(arr);
		bubbleSort(arr);
		}
	
}
