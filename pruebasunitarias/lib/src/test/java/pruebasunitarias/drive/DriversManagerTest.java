package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager driversManager = new DriversManager();
	
	@DisplayName("Pruebas en el método addPassenger")
	@Test
	void isAddpassenger() {
		Passenger passenger1 = new Passenger("Karla Herrera", "HESK971");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1, driversManager.getPassenger("HESK971"));
	}
	
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Guzman", "Tesla", 200);
		driversManager.addDriver(driver1);
		assertEquals(driver1, driversManager.getDriver("Tesla"));
	}

}
