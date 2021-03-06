package food;

import animals.Animal;
import animals.Rabbit;

public class Carrot extends Grass{
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 20);
    }
}
