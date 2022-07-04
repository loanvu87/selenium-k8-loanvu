package lab_12;

public class Horse extends Animal {

    int maxSpeed = 75;
    int animalSpeed;
    String name = "con ngựa";
    public Horse() {
        flyBehavior = new NoWings();
        speedBehavior = new SelfSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "maxSpeed=" + maxSpeed +
                ", animalSpeed=" + animalSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
