package Test;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
		Arrays.sort(array);
		int secondsmallest = array[1];
		int secondlargest = array[array.length - 2];
		System.out.println("Second smallest no:" + secondsmallest);
		System.out.println("Second largest no:" + secondlargest);

	}

}
