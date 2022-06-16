package lab_09;

import java.security.SecureRandom;

public class Animal {

    private String animalName = "";
    private int animalSpeed = 0;
    private boolean withWings = true;

    protected Animal(Builder builder) {
        this.animalName = builder.animalName;
        this.animalSpeed = builder.animalSpeed;
        this.withWings = builder.withWings;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    public static class Builder {
        private String animalName = "";
        private int animalSpeed = 0;
        private boolean withWings = true;

        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }

        public Builder setAnimalSpeed(int maxSpeed) {
            while (animalSpeed == 0){
                this.animalSpeed = new SecureRandom().nextInt(maxSpeed);
            }
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
