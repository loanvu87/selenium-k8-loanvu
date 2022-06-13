package lab_08.bai2;

import java.security.SecureRandom;

public class Horse extends Animal {
    String name = "con ngựa";
    int speed;

    public Horse(int maxSpeed) {
        this.speed = super.getSpeed(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

}
