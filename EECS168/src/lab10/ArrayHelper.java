package lab10;

public class ArrayHelper {
	// The method names are pretty much a tl;dr for what they do.
	public void print2DArray(int[][] array) {
		System.out.println("Here is your array:");
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j]);
				if(j < array[i].length - 1){
					System.out.print(", ");;
				}
			}
			System.out.println();
		}
		
	}
	
	public int arraySum(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return sum;
	}
	
	public double arrayAvg(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return (double)sum / array.length;
	}

	public int arraySum2D(int[][] array){
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				sum = sum + array[i][j];
			}
		}
		return sum;
	}
	
	public double arrayAvg2D(int[][] array){
		return (double)arraySum2D(array) / array.length / array[0].length;
	}
	
}
