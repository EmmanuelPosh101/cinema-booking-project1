package fr.efrei.cinemabookingproject1.domain;

public class Screen{
    private String Type;
    private int capacity;

    public Screen(String type) {
        Type = type;
    }

    public static Object builder() {
    return null;
    
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setScreenNumber(int screenNumber) {
    }

    public int getScreenNumber() {
        int screenNumber = 0;
        return screenNumber;
    }

    @Override
    public String toString() {
        return " Screen Type: " + Type +"Capacity" + capacity+ " Screen Number: " + getScreenNumber();
    }
}


