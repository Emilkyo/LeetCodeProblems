package com.leetcode.problems.task1603;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    @Test
    void TestCase() {
        try {
            Constructor<?> constructor = getParkingSystemConstructor();
            ParkingSystem parking = (ParkingSystem) constructor.newInstance(1, 1, 0);
            assertTrue(parking.addCar(1));
            assertTrue(parking.addCar(2));
            assertFalse(parking.addCar(3));
            assertFalse(parking.addCar(1));
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            Assertions.fail("Some ParkingSystem class configuration problems");
        }
    }

    private Constructor<?> getParkingSystemConstructor() throws NoSuchMethodException {
        Constructor<?> constructor = ParkingSystem.class.getConstructor(int.class, int.class, int.class);
        Assertions.assertNotNull(constructor, "There is no constructor with 3 parameters");
        return constructor;
    }
}