package lab_12;

public class Falcon extends Animal {

    int maxSpeed = 150;
    int animalSpeed;
    String name = "con chim ưng";
    public Falcon() {
        flyBehavior = new AnimalWithWings();
        speedBehavior = new AnimalSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "Falcon{" +
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
