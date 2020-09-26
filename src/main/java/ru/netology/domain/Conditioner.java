package ru.netology.domain;

public class Conditioner {
    private int currentTemperature;
    private int minTemperature;
    private int maxTemperature;
    private boolean on;
    private String name;

    public void increaseCurrentTemperature(){
        int currentTemperature = this.currentTemperature;
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature() {
        int currentTemperature = this.currentTemperature;

        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature - 1;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




