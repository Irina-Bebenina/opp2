package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldChangeTheStationByRemoteControl() {
        Radio radio = new Radio();
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void shouldByRemoteControlIfNumberIsWrong() {
        Radio radio = new Radio();
        assertEquals(5, radio.changeTheStationByRemoteControl(15));
    }

    @Test
    void shouldTheStationByNextButtonIfCurrentIsNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        Radio radio = new Radio();
        radio.changeTheStationByNextButton();
        assertEquals(6, radio.getCurrentRadioStation());
    }
    @Test

    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radio radio = new Radio();
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        shouldDecreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}

