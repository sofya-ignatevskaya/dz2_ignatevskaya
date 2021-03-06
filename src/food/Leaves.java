package food;

import animals.Animal;

public class Leaves extends Grass {
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 10);
    }
}
