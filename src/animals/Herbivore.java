package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public Herbivore(String name, String aviarysize) {
        super(name, aviarysize);
    }

    public Herbivore() {
    }

    @Override
    public void eat(Food food) {
        food.addSatiety(this);
        System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                ". Satiety is " + this.getSatiety());
    }
}
