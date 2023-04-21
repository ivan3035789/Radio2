package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();
        String expected = "Радио";

        assertNull(radioAdvanced.getName());
        radioAdvanced.setName(expected);
        assertEquals(expected, radioAdvanced.getName());
    }
    @Test
    public void showsNumberRadioStationsDefaultRadioStations() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        assertEquals(10, radioAdvanced.getMaxRadioStationNum());
    }

    @Test
    public void showsNumberRadioStationsSetByUser() {
        RadioAdvanced radioAdvanced = new RadioAdvanced(15);

        assertEquals(14, radioAdvanced.getMaxRadioStationNum());

    }

    @Test
    public void radioStationIncreaseOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        radioAdvanced.increaseCurrentStationNumber();
        assertEquals(1, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(5);
        radioAdvanced.increaseCurrentStationNumber();
        assertEquals(6, radioAdvanced.getCurrentRadioStationNum());
    }
    @Test
    public void switchingFromTheMaximumRadioStationToTheNextOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(10);
        radioAdvanced.increaseCurrentStationNumber();
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void radioStationDecreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(10);
        radioAdvanced.reducingCurrentStationNumber();
        assertEquals(9, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(5);
        radioAdvanced.reducingCurrentStationNumber();
        assertEquals(4, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void switchingFromTheMinimumRadioStationToThePreviousOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        radioAdvanced.reducingCurrentStationNumber();
        assertEquals(10, radioAdvanced.getCurrentRadioStationNum());
    }

    @Test
    public void volumeIncreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(0);
        radioAdvanced.increaseVolume();
        assertEquals(1, radioAdvanced.getSoundVolume());

        radioAdvanced.setSoundVolume(50);
        radioAdvanced.increaseVolume();
        assertEquals(51, radioAdvanced.getSoundVolume());
    }

    @Test
    public void increaseTheVolumeByOneAtMaximumSound() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(100);
        radioAdvanced.increaseVolume();
        assertEquals(100, radioAdvanced.getSoundVolume());

        radioAdvanced.increaseVolume();
        assertEquals(100, radioAdvanced.getSoundVolume());

    }

    @Test
    public void volumeDecreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(100);
        radioAdvanced.reducingVolume();
        assertEquals(99, radioAdvanced.getSoundVolume());

        radioAdvanced.setSoundVolume(50);
        radioAdvanced.reducingVolume();
        assertEquals(49, radioAdvanced.getSoundVolume());
    }

    @Test
    public void decreaseTheSoundByOneAtTheMinimumVolume() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(0);
        radioAdvanced.reducingVolume();
        assertEquals(0, radioAdvanced.getSoundVolume());

        radioAdvanced.reducingVolume();
        assertEquals(0, radioAdvanced.getSoundVolume());
    }

    @Test
    public void checksValidRadioStationNumbersForInput() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(5);
        assertEquals(5, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void checksInvalidRadioStationNumbersForInput() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(-11);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(11);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());
    }

}