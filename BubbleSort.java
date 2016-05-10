import java.util.*;

/*
 * In bubble sort, we basically traverse the array from first
 * to array_length - 1 position and compare the element with the next one.
 * Element is swapped with the next element if the next element is greater.
 *
 * Bubble sort steps are as follows.
 *
 * 1. Compare array[0] & array[1]
 * 2. If array[0] > array [1] swap it.
 * 3. Compare array[1] & array[2]
 * 4. If array[1] > array[2] swap it.
 * ...
 * 5. Compare array[n-1] & array[n]
 * 6. if [n-1] > array[n] then swap it.
 *
 * After this step we will have largest element at the last index.
 *
 * Repeat the same steps for array[1] to array[n-1]
 *  
 */

public class BubbleSort {
	public static void main(String args[] ){
		int array[] = {2,1,9,1000,687,223,2000};
		bubbleSortImproved(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i] + " ");
		}
	}
	
	/* Algo takes O(n^2) time even in best case*/
	
	public static void bubbleSort(int array[]){
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < (array.length - i); j++){
				if ( array[j - 1] > array[j]){
					swapNumbers(j-1,j,array);
				}
			}
		}
	}
	
	/*We have used extra flag to improve the performance. 
	 * If the list is already sorted, then no swaps*/
	
	public static void bubbleSortImproved(int array[]){
		boolean swapped = true;
		for(int i = 0; i < array.length && swapped; i++){
			swapped = false;
			for(int j = 1; j < (array.length - i); j++){
				if ( array[j - 1] > array[j]){
					swapNumbers(j-1,j,array);
					swapped = true;
				}
			}
		}
	}
	
	private static void swapNumbers(int i, int j, int array[]){
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
