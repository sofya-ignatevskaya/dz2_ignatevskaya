package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satiety) {
        super(name, satiety);
    }

    public Carnivorous(String name, String aviarysize) {
        super(name, aviarysize);
    }

    public Carnivorous() {
    }

    @Override
    public void eat(Food food) {
        food.addSatiety(this);
        System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                ". Satiety is " + this.getSatiety());
    }
}
