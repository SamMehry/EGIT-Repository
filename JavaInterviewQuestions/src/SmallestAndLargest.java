import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {


		int[] numbers = {-34, 0, 34,55343, -434, 0, 2};
		
		
		int largest = numbers [0];
		int smallest = numbers [0];
		
		for(int i = 1; i<numbers. length; i++) {
			if(numbers[i]>largest) {
				largest = numbers [i];
			}
			else if (numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Array integers are:"+ Arrays.toString(numbers));
		System.out.println("Largest integer number:"+ largest);
		System.out.println("Smallest integer number:"+ smallest);
		
		
	}

}
