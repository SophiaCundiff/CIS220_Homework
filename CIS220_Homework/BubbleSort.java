// Sophia Cundiff
// Chpt 3 PA

// This program sorts through the numbers in an algorithm to place them in ascending order

public class BubbleSort {
	
	public static void bubbleSort(int[] Array, int ARRAY_SIZE) {
		// Variables to iterate through and hold values in the array
		int i = 0;
		int j = 0;
		int temp = 0;
		
			// Sort the array
			for (i = 0; i <= (ARRAY_SIZE - 2); ++i) {
				for (j = 0; j <= (ARRAY_SIZE - 2); ++j) {
					if (Array[j] > Array[j + 1]) {
						temp = Array[j];
						Array[j] = Array[j + 1];
						Array[j + 1] = temp;
					}
				}
			}
		}
		
		
	public static void main(String[] args) {
		int Array[] = {93, 52, 72, 42, 3, 63, 100, 19, 61, 44, 21, 98, 6, 41, 78, 5, 51, 60, 67, 11};
		int ARRAY_SIZE = 20;
		int i = 0;
		
		// Call BubbleSort to sort the array
		bubbleSort(Array, ARRAY_SIZE);
		
		// Output the sorted array
		System.out.print("The sorted array is:");
		for (i = 0; i < ARRAY_SIZE; ++i) {
			 System.out.print(" " + Array[i]);
		}
		System.out.println("");
	}
}