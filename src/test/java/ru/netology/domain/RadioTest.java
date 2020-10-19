package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStationValid() {
        Radio radio = new Radio(5, 9);
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationInvalidMax() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationInvalidMin() {
        Radio radio = new Radio(1, 9);
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationIncreaseValid() {
        Radio radio = new Radio(5, 9);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationIncreaseValidMax() {
        Radio radio = new Radio(9, 9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationDecreaseValid() {
        Radio radio = new Radio(5, 9);
        radio.decreaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationDecreaseValidMin() {
        Radio radio = new Radio(0, 9);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio(0, 5, 100);
        radio.setCurrentVolume(6);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMax() {
        Radio radio = new Radio(0, 5, 100);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMin() {
        Radio radio = new Radio(0, 5, 100);
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncreaseMax() {
        Radio radio = new Radio(0, 100, 100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncrease() {
        Radio radio = new Radio(0, 5, 100);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecrease() {
        Radio radio = new Radio(0, 5, 100);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecreaseMin() {
        Radio radio = new Radio(0, 0, 100);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

