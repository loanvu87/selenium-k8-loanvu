package lab_10;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Animal {

    int maxSpeed;

    public abstract int getSpeed();

    public abstract String getName();

    public int getAnimalSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
