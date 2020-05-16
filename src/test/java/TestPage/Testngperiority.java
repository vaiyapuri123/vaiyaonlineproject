package TestPage;

import org.testng.annotations.Test;

public class Testngperiority {
	@Test(priority=2)
	public void tes11() {
		System.out.println("test11");
	}
	@Test
	public void tes12() {
		System.out.println("test12");
	}
	@Test(invocationCount=5)
	public void tes13() {
		System.out.println("test13");
	}
	@Test(invocationCount=5)
	public void tes14() {
		System.out.println("test14");
	}
	@Test(priority=3)
	public void tes15() {
		System.out.println("test15");
	}

}
