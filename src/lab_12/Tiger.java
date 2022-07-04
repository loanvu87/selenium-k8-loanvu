package lab_12;

public class Tiger extends Animal {

    int maxSpeed = 75;
    int animalSpeed;
    String name = "con hổ";
    public Tiger() {
        flyBehavior = new AnimalNoWings();
        speedBehavior = new AnimalSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "maxSpeed=" + maxSpeed +
                ", animalSpeed=" + animalSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
