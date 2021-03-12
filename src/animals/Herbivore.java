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
        if (food instanceof Grass) {
            food.addSatiety(this);
            System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                    ". Satiety is " + this.getSatiety());
        } else {
            System.out.println("Растительноядные не едят мясо: " + food.getClass().getSimpleName());
        }
    }
}
