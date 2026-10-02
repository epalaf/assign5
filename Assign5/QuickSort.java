

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		
		showArray(array);
		
		quickSort(array);
		
		showArray(array);
		
	}
	public static void exchange(int[] array, int IndexA, int IndexB) {
		int temp = array[IndexA];
		array[IndexA] = array[IndexB];
		array[IndexB] = temp;
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	public static int Partition(int[] array, int start, int end) {
		/*int smallIndex = end;
		
		for (int i = end - 1; i >= start; i--) {
			if (array[i] > array[smallIndex]) {
				
			}
		}
		
		return smallIndex; */
		int smallIndex = start;
		
		for (int i = start + 1; i <= end; i++) {
			if (array[i] < array[smallIndex]) {
				smallIndex = smallIndex + 1;
				exchange(array, smallIndex, i);
			}
		}
		exchange(array, start, smallIndex);
		
		return smallIndex;
	} 
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
	}
	public static void RecursiveQuickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivotValue = Partition(array, start, end);
			RecursiveQuickSort(array, start, pivotValue - 1);
			RecursiveQuickSort(array, pivotValue + 1, end);
		}
	}
	
	public static void quickSort(int[] array, int left, int right) {
		int start = 0;
		int end = array.length - 1;
		RecursiveQuickSort(array, start, end);
		
	}
	

}
