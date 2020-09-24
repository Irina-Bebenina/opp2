package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperatureInNormalCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }


    @Test
    void shouldIncreaseCurrentTemperatureInHeatCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(32);
        conditioner.increaseCurrentTemperature();
        assertEquals(32, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInUsualConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInColdConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(18);
        conditioner.decreaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }
    @Test
    void shouldMaxTemperatureConditions(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(32);
        assertEquals(32,conditioner.getMaxTemperature());
    }
@Test
    void shouldMinTemperatureConditions(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        assertEquals(18,conditioner.getMinTemperature());
    }
}

