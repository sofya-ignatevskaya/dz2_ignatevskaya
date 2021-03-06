package food;

import animals.Animal;

public class MeatForFox extends Meat{
    @Override
    public void addSatiety(Animal animal) {
        animal.setSatiety(animal.getSatiety() + 50);
    }
}
