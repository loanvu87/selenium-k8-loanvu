package lab_12;

public class Animal {

    String name = "";
    int animalSpeed;

    public String getName() {
        return name;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    protected FlyBehavior flyBehavior;
    protected SpeedBehavior speedBehavior;

    protected int getAnimalSpeed(int maxSpeed) {
        return speedBehavior.animalSpeed(maxSpeed);
    }

    protected boolean getFlyBehavior() {
        return flyBehavior.isFlyAble();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
