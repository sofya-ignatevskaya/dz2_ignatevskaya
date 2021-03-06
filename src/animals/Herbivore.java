package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public Herbivore() {
    }

    @Override
    public void eat(Food food) {
        System.out.println(this.getName() + " ест " + food.getClass().getName() +
                ". Satiety is " + this.getSatiety());
    }
}
