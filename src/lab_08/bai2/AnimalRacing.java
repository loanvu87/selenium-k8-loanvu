package lab_08.bai2;

import java.util.*;

public class AnimalRacing {

    public static void main(String[] args) {
        int maxDogSpeed = 60;
        int maxTigerSpeed = 100;
        int maxHorseSpeed = 75;

        Animal dog = new Dog(maxDogSpeed);
        Animal horse = new Horse(maxHorseSpeed);
        Animal tiger = new Tiger(maxTigerSpeed);
        new AnimalRacing().getWinner(Arrays.asList(dog, horse, tiger));
    }

    public static void getWinner(List<Animal> animalList) {
        Map<String, Integer> animalMap = new HashMap<>();
        for (Animal animal : animalList) {
            animalMap.put(animal.getName(), animal.getSpeed());
        }
        String winner = "";
        int maxSpeed = 0;
        for (String name : animalMap.keySet()) {
            if (animalMap.get(name) > maxSpeed) {
                maxSpeed = animalMap.get(name);
                winner = name;
            }
        }
        System.out.println(animalMap);
        System.out.println("Winner is: ".concat(winner).concat(" with ") + maxSpeed + " km/h");
    }
}
