package lab_10;

public class Tiger extends Animal {

    int maxSpeed = 100;
    String name = "con hổ";

    @Override
    public int getSpeed() {
        return super.getAnimalSpeed(maxSpeed);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
