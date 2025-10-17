package Test;

public class Sample2 extends Sample1 
{
	@Override
	public void callview(int a) 
	{
		super.callview(a);
		
	}
	

	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		s1.callview(30);
		System.out.println ("---------------------");
		Sample1 s2 = new Sample2();
		s1.callview(40);

	}

}
