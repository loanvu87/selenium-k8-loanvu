package lab_10;

public class Horse extends Animal {

    int maxSpeed = 75;
    String name = "con ngựa";

    @Override
    public int getSpeed() {
        return super.getAnimalSpeed(maxSpeed);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
