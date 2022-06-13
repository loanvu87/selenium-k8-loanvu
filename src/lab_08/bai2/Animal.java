package lab_08.bai2;

import java.security.SecureRandom;

public class Animal {
    String name;
    int animalSpeed;

    public int getSpeed(int speed) {
        return animalSpeed = new SecureRandom().nextInt(speed);
    }

    public int getSpeed() {
        return animalSpeed;
    }

    public String getName() {
        return name;
    }
}
