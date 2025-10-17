package Test;

public class RedBus extends Bus{
	
	@Override
	public void ticket() {
		System.out.println("Running RedBus ticket Method");
	}
	
	@Override
	public void destination() {
		System.out.println("Running RedBus destination Method");

	}

}
