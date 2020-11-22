package pl.accenture.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.accenture.oop.factoryPattern.elements.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("Should return 7")
    void getFuelNeeds() {
        // Given
        Car car = new Car();
        // When
        double fuelNeeds = car.getFuelNeeds();
        // Then
        assertEquals(7, fuelNeeds);
    }

    @Test
    @DisplayName("Should return 30")
    void getDistance() {
        // Given
        Car car = new Car();
        // When
        double distance = car.getDistance();
        // Then
        assertEquals(30, distance);
    }
}