package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@BeforeEach
	public void init()
	{
		System.out.println("Debut test ");
	}
	@Test
	void test1() {
		//fail("Not yet implemented");
		assertEquals(Welcome.welcome("bob"),"Hello,Bob");
		System.out.println("Test 1 OK");
	}
	@Test
	void test2() {
		assertEquals(Welcome.welcome("bob"),"Hello,Bob");
		assertEquals(Welcome.welcome(" "),"Hello,my friend");
		assertEquals(Welcome.welcome("  "),"Hello,my friend");
	}

}
