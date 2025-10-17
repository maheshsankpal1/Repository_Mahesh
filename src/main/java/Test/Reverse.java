package Test;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Employee" ;
		String reversed = "";
		
		for (int i = st.length()-1; i >=0; i--)
		{
			reversed += st.charAt(i);
		}
		
		System.out.println(reversed);

	}

}
