package lab_12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalRacing {

    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Dog(), new Horse(), new Tiger(), new Eagle(), new Falcon());
        System.out.println("Animals registered the race are: ");
        for (Animal animal : animalList) {
            System.out.println("- ".concat(animal.toString()));
        }
        System.out.print("\n");
        new AnimalRacing().getWinner(animalList);
    }

    public void getWinner(List<Animal> animalList) {
        String winner = "";
        int maxSpeed = 0;
        String animalWithWings = "";
        Map<String, Integer> animalRacingMap = new HashMap<>();
        for (Animal animal : animalList) {
            if (animal.getFlyBehavior() == false) {
                animalRacingMap.put(animal.getName(), animal.getAnimalSpeed());
            } else {
                animalWithWings = (animal.getName()).concat(", ").concat(animalWithWings);
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
