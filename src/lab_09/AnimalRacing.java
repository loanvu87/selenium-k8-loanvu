package lab_09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal dog = new Animal.Builder().setAnimalName("con chó").setAnimalSpeed(60).setWithWings(false).build();
        Animal falcon = new Animal.Builder().setAnimalName("chim ưng").setAnimalSpeed(150).setWithWings(true).build();
        Animal tiger = new Animal.Builder().setAnimalName("con hổ").setAnimalSpeed(100).setWithWings(false).build();
        Animal horse = new Animal.Builder().setAnimalName("con ngựa").setAnimalSpeed(75).setWithWings(false).build();
        Animal eagle = new Animal.Builder().setAnimalName("con đại bàng").setAnimalSpeed(250).setWithWings(true).build();
        new AnimalRacing().getWinner(Arrays.asList(dog, falcon, eagle, tiger, horse));
    }

    public void getWinner(List<Animal> animalList) {
        String winner = "";
        int maxSpeed = 0;
        String animalWithWings = "";
        Map<String, Integer> animalRacingMap = new HashMap<>();
        for (Animal animal : animalList) {
            if (animal.isWithWings() == false) {
                animalRacingMap.put(animal.getAnimalName(), animal.getAnimalSpeed());
            } else {
                animalWithWings = (animal.getAnimalName()).concat(", ").concat(animalWithWings);
            }
        }
        for (String name : animalRacingMap.keySet()) {
            if (animalRacingMap.get(name) > maxSpeed) {
                maxSpeed = animalRacingMap.get(name);
                winner = name;
            } else if (animalRacingMap.get(name) == maxSpeed) {
                winner = winner.concat(",").concat(name);
            }
        }
        if (animalWithWings != "") {
            System.out.println("Animals that cannot attend the race are: " + animalWithWings);
        }
        System.out.println("Animals in the race are: " + animalRacingMap);
        System.out.println("Winner is: ".concat(winner).concat(" with ") + maxSpeed + " km/h");
    }

}
