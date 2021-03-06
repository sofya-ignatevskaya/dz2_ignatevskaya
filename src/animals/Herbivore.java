package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Растительноядные не едят мясо");
        } else {
            System.out.println(this.getName() + " ест " + food.getName());
        }
    }
}
