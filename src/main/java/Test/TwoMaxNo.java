package Test;

public class TwoMaxNo {
	
	public void MaxTwo(int[] num) {
		int max1 = 0;
		int max2 = 0;
		for(int n : num ) {
			if(max1 < n) { 
					max2 = max1; 
					max1 = n;
			 } 
	        } 
	        System.out.println("First Max Number: "+max1); 
	        System.out.println("Second Max Number: "+max2); 
	    } 
			
		
		
		
	

	public static void main(String[] args) {
	int[] num = {5, 9, 7, 11, 55, 5,8 };
	TwoMaxNo tmn = new TwoMaxNo(); 
     tmn.MaxTwo(num);

	}
}


