package com.thoughtworks.bootcamp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class BootcampApplicationTests {

	@Test
	void testAreaOfRectangleReturnsOutput() {
		Random rand = new Random();
		Integer length = rand.nextInt(1000);
		Integer breadth = rand.nextInt(1000);
		assertEquals(BootcampApplication.findAreaOfRectangle(length,breadth),length*breadth);
	}

	@Test
	void testAreaOfRectangleNullBreadthInputAssertsException() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		Integer length = rand.nextInt(1000);
		Integer breadth = null;
		Exception exception = assertThrows(RuntimeException.class, () -> {
			BootcampApplication.findAreaOfRectangle(length,breadth);
		});

		String expectedMessage = "Invalid Input";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	void testAreaOfRectangleNegativeInputAssertsException() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int length = rand.nextInt(1000) * -1;
		int breath = rand.nextInt(1000);
		Exception exception = assertThrows(RuntimeException.class, () -> {
			BootcampApplication.findAreaOfRectangle(null,length);
		});

		String expectedMessage = "Invalid Input";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}



}
