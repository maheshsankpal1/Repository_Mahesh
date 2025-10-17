package arttoframe.Crm_Email_PageObject;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		System.out.println("Random Numbers Between 0 to 50:");
		Random r = new Random();
		for (int i = 0; i < 5; i++)
			System.out.println(r.nextInt(50));

	}

}
