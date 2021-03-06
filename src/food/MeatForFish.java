package food;

import animals.Animal;

public class MeatForFish extends Meat{
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 35);
    }
}
