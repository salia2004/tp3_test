package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"),"Hello,Bob");
		System.out.println("Test 1 OK");
	}
	@Test
	void test2() {
		assertEquals(Welcome.welcome(" "),"Hello,my friend");
		assertEquals(Welcome.welcome("  "),"Hello,my friend");
		System.out.println("Test 2 OK");
	}
	
	@Test
	void test3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO,JERRY");
		System.out.println("Test 3 OK");
	}
	
	@Test
	void test4() {
		assertEquals(Welcome.welcome("Amy,Bob"),"Hello, Amy, Bob");
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
		System.out.println("Test 4 OK");
	}
	@Test
	void test5() {
		assertEquals(Welcome.welcome("Amy,bob,Jerry"),"Hello, Amy, Bob, Jerry");
		assertEquals(Welcome.welcome("amy,Bob,jerry,Tom,bambi"),"Hello, Amy, Bob, Jerry, Tom, Bambi");
		System.out.println("Test 5 OK");
	}
		

}

