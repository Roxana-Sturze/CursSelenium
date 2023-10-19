package curs14;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority = 0)
	public void one() {
		System.out.println("One");
	}

	@Test(priority = 1)
	public void two() {
		System.out.println("Two");
	}
	
	@Test(priority = 2)
	public void three() {
		System.out.println("Three");
	}
}
