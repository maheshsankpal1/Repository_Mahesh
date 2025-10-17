package Test;

public class PrintEven {

	public static void main(String[] args) {
		int[] array = {24, 54, 22, 62, 21, 53, 33};
		
		System.out.println("Even numbers are :");
		for (int i = 0; i < array.length; i++)
		{
			if ( array[i] % 2 == 0){
				System.out.println(array[i] + "");
				
			}
		}
		
		

	}

}
