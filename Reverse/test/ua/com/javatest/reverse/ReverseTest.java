package ua.com.javatest.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		assertEquals("olleH dlroW", Reverse.reverse("Hello World"));
	}

}
