package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satiety) {
        super(name, satiety);
    }

    public Carnivorous() {
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            food.addSatiety(this);
            System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                    ". Satiety is " + this.getSatiety());
        } else {
            System.out.println("Хищники не едят растения: " + food.getClass().getSimpleName());
        }
    }
}
