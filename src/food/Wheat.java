package food;

import animals.Animal;

public class Wheat extends Grass {
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 15);
    }
}
