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
	void findAreaOfRectangleReturnsOutput() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		int rand_int2 = rand.nextInt(1000);
		assertEquals(BootcampApplication.findAreaOfRectangle(rand_int1,rand_int2),rand_int1*rand_int2);
	}

	@Test
	void findAreaOfRectangleNullBreadthInputAssertsException() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(1000);
		Exception exception = assertThrows(RuntimeException.class, () -> {
			BootcampApplication.findAreaOfRectangle(rand_int1,null);
		});

		String expectedMessage = "Input Cannot be null";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	void findAreaOfRectangleNullLengthInputAssertsException() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(1000);
		Exception exception = assertThrows(RuntimeException.class, () -> {
			BootcampApplication.findAreaOfRectangle(null,rand_int1);
		});

		String expectedMessage = "Input Cannot be null";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}



}
