package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Screen;

public class ScreenFactory {

    public static Screen createScreen(int screenNumber, String Type, int capacity) {
        Screen screen;
        if (Screen.builder() == null) screen = null;
        else screen = Screen.builder()

                .type(Type)
                .capacity(capacity)
                .build();
        Screen screen1 = screen;
        return screen1;
    }
}


