package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@BeforeEach
	public void init()
	{
		System.out.println("Debut test tp3 ..");
	}
	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(Welcome.welcome("bob"),"Hello,Bob");
	}

}
