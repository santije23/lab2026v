package com.udea.lav2026v;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lav2026vApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals("The actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationLength() {
		Integer nationsLength = dataController.getRandomnNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRandomnCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void aviationsLength() {
		Integer aviatiosLength = dataController.getRandomnAviation().size();
		assertEquals(20, aviatiosLength);
	}

}
