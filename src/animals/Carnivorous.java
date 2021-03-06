package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satiety) {
        super(name, satiety);
    }

    public Carnivorous() {
    }

    @Override
    public void eat(Food food) {
        food.addSatiety(this);
        System.out.println(this.getName() + " ест " + food.getClass().getName() +
                ". Satiety is " + this.getSatiety());
    }
}
