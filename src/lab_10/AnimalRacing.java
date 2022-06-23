package lab_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        new AnimalRacing().getWinner(Arrays.asList(dog, tiger, horse));
    }

    public void getWinner(List<Animal> animalList) {
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
            } else if (animalMap.get(name) == maxSpeed) {
                winner = winner.concat(",").concat(name);
            }
        }
        System.out.println(animalMap);
        System.out.println("Winner is: ".concat(winner).concat(" with ") + maxSpeed + " km/h");
    }
}
