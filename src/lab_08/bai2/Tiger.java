package lab_08.bai2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    int speed;
    String name = "con hổ";

    public Tiger(int maxSpeed) {
        this.speed = super.getSpeed(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
