package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Screen;

public class ScreenFactory {

    public static Screen createScreen(int screenNumber, String type, int capacity) {

        return new Screen.Builder()
                .setType(type)
                .setCapacity(capacity)
                .setScreenNumber(screenNumber)
                .build();
    }
}