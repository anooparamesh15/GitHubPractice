package Demo;

import org.testng.annotations.Test;

public class Practice1Test {
	@Test(groups="smoke")
	public void CarTest()
	{
		System.out.println("Audi");
		System.out.println("Benz");
		System.out.println("BMW");
		System.out.println("Porsche");
	}
}