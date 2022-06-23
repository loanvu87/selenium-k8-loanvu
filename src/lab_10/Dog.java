package lab_10;

public class Dog extends Animal {

    int maxSpeed = 60;
    String name = "con chó";

    @Override
    public int getSpeed() {
        return super.getAnimalSpeed(maxSpeed);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
