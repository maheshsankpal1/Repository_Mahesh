package Test;

public class Sample1 {
	private void view(int a) 
	{
		System.out.println("Running private method");
		System.out.println("a value is" + a);

	}

	public void callview(int a) 
	{
		System.out.println("Running view method");
		view(a);

	}

	
}
