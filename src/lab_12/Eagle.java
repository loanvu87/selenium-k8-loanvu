package lab_12;

public class Eagle extends Animal {

    int maxSpeed = 250;
    int animalSpeed;
    String name = "con đại bàng";
    public Eagle() {
        flyBehavior = new HasWings();
        speedBehavior = new SelfSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "Eagle{" +
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
