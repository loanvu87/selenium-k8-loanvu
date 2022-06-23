package lab_10;

import java.security.SecureRandom;

public abstract class Animal {

    int maxSpeed;

    public abstract int getSpeed();

    public abstract String getName();

    public int getAnimalSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
