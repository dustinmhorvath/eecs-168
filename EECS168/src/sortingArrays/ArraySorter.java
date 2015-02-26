/*
 * This program takes in an array and sorts it. I might 
 * convert this into a standalone method class later.
 */
package sortingArrays;

public class ArraySorter {

	public static void main(String[] args) {
		int[] array = {5,2,3,1,7,8,4,10};

		array = bubbleSort(array);
		
		
		for(int i = 0; i < array.length; i++){
		
		System.out.println(array[i]);
		
		}
	}
	
	
	public static int[] bubbleSort(int[] inputArray){
		for(int j = 0; j < inputArray.length; j++){
			for(int i = 0; i < inputArray.length-1; i++){
				if(inputArray[i] > inputArray[i + 1]){
					int temp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = temp;
				}
			}
		}
		return inputArray;
		
	}
	
	public static int[] indexSort(int[] inputArray){
		int[] temp = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++){
			temp[i] = inputArray[i];
		}
		
		int counter = 0;
		
		for(int i = 0; i < inputArray.length; i++){
			counter = 0;
			for(int j = 0; j < inputArray.length; j++){
				
				if(temp[i] > temp[j]){
					counter++;
				}
				
			}
			inputArray[counter] = temp[i];
		}
		
		return inputArray;
	}
	
	
	
}
