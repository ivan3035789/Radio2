package ru.netology.domain;

public class RadioAdvanced {
    private String name;
    private int currentRadioStationNum;
    private int maxRadioStationNum = 9;
    private int minRadioStationNum = 0;
    private int soundVolume;
    private int maximumVolume = 10;
    private int minimumVolume = 0;
    private int radioStationNum;
    boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadioStationNum() {
        return radioStationNum;
    }

    public void setRadioStationNum(int radioStationNum) {
        this.radioStationNum = radioStationNum;
    }

    public int getMinRadioStationNum() {
        return minRadioStationNum;
    }

    public void setMinRadioStationNum(int minRadioStationNum) {
        this.minRadioStationNum = minRadioStationNum;
    }

    public int getMinimumVolume() {
        return minimumVolume;
    }

    public void setMinimumVolume(int minimumVolume) {
        this.minimumVolume = minimumVolume;
    }

    public int getMaxRadioStationNum() {
        return maxRadioStationNum;
    }

    public void setMaxRadioStationNum(int maxRadioStationNum) {
        this.maxRadioStationNum = maxRadioStationNum;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public int getMaximumVolume() {
        return maximumVolume;
    }

    public void setMaximumVolume(int maximumVolume) {
        this.maximumVolume = maximumVolume;
    }

    public int getCurrentRadioStationNum() {
        return currentRadioStationNum;
    }

    public void setCurrentRadioStationNum(int currentRadioStationNum) {
        if (currentRadioStationNum > maxRadioStationNum) {
            return;
        }
        if (currentRadioStationNum < minRadioStationNum) {
            return;
        }
        this.currentRadioStationNum = currentRadioStationNum;
    }



    public void increaseCurrentStationNumber() {
        if (currentRadioStationNum < maxRadioStationNum) {
            currentRadioStationNum = currentRadioStationNum + 1;
        } else {
            currentRadioStationNum = minRadioStationNum;
        }
    }

    public void reducingCurrentStationNumber() {
        if (currentRadioStationNum > minRadioStationNum) {
            currentRadioStationNum = currentRadioStationNum - 1;
        } else {
            currentRadioStationNum = maxRadioStationNum;
        }
    }


    public void increaseVolume() {
        if (soundVolume < maximumVolume) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = maximumVolume;
        }
    }

    public void reducingVolume() {
        if (soundVolume > minimumVolume) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = minimumVolume;
        }
    }
}
