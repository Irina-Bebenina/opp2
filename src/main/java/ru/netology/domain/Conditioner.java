package ru.netology.domain;

public class Conditioner {
    private int currentTemperature = 22;
    private int minTemperature = 18 ;
    private int maxTemperature = 32 ;
    private boolean on;

    public void increaseCurrentTemperature() {
        int maxTemperature = 32;
        if (currentTemperature == maxTemperature) {
            return;
        } else {
            currentTemperature += 1;
        }
    }

    public void decreaseCurrentTemperature() {
        int minTemperature = 18;
        if (currentTemperature == minTemperature) {
            return;
        } else {
            currentTemperature -= 1;
        }
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

    public void setMaxTemperature (int maxTemperature){
        this.maxTemperature=maxTemperature;
  }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}




