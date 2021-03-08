package animals;

import MyException.WrongFoodException;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public Herbivore(String name, SizeAviary sizeAviary) {
        super(name, sizeAviary);
    }

    public Herbivore() {
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        food.addSatiety(this);
        System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                ". Satiety is " + this.getSatiety());
    }
}
