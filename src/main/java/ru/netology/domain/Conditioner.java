package ru.netology.domain;

public class Conditioner {
    private int currentTemperature = 22;

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

        this.currentTemperature = currentTemperature;

    }

}
