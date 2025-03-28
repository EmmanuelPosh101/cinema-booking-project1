package fr.efrei.cinemabookingproject1.domain;
/*Vuyolwethu Piyo
222875437

 */
public class Screen {
    private String type;
    private int capacity;
    private int screenNumber;  // ✅ Add missing screenNumber field

    private Screen(Builder builder) {
        this.type = builder.type;
        this.capacity = builder.capacity;
        this.screenNumber = builder.screenNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    @Override
    public String toString() {
        return "Screen Type: " + type + ", Capacity: " + capacity + ", Screen Number: " + screenNumber;
    }


    public static class Builder {
        private String type;
        private int capacity;
        private int screenNumber;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setScreenNumber(int screenNumber) {  // ✅ Now this method exists!
            this.screenNumber = screenNumber;
            return this;
        }

        public Screen build() {
            return new Screen(this);
        }
    }
}
