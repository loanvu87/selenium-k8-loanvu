package lab_08.bai2;

import java.security.SecureRandom;

public class Dog extends Animal {
    int speed;
    String name = "con chó";

    public Dog(int maxSpeed) {
        this.speed = super.getSpeed(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
