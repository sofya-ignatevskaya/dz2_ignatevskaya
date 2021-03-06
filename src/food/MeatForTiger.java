package food;

import animals.Animal;

public class MeatForTiger extends Meat{
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 70);
    }
}
