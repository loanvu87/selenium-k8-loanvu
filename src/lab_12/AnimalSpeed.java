package lab_12;

import java.security.SecureRandom;

public class AnimalSpeed implements SpeedBehavior{

    @Override
    public int animalSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
