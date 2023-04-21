package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void changeStation() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(10, radio.maxRadioStationNum);
        assertEquals(0, radio.minRadioStationNum);
        assertEquals(0, radio.currentRadioStationNum);
        assertFalse(radio.on);
    }

    @Test
    public void changeVolume() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(100, radio.maximumVolume);
        assertEquals(0, radio.minimumVolume);
        assertEquals(0, radio.radioStationNum);
        assertFalse(radio.on);
    }
}