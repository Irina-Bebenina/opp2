package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperatureInNormalCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldIncreaseCurrentTemperatureInHeatCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInUsualConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInColdConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
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

    @Test
    public void setOnTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        assertTrue(conditioner.isOn());
    }

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондиционер";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }
}

