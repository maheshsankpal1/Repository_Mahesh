package Test;

public class Occurance {

	public static void main(String[] args) {
		String str = "HAKUNAMATATA";
		int[] count = new int[256];
		  for (int i = 0; i < str.length(); i++) {
	            count[str.charAt(i)]++;
	        }
		  for (int i = 0; i < count.length; i++) {
	            if (count[i] > 0) {
	                System.out.println((char)i + " → " + count[i]);
	            }
	        }

	}

}
