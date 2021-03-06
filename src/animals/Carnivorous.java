package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Хищники не едят растения");
        } else {
            System.out.println(this.getName() + " ест " + food.getName());
        }
    }
}
