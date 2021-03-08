package animals;

import MyException.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satiety) {
        super(name, satiety);
    }

    public Carnivorous(String name, SizeAviary sizeAviary) {
        super(name, sizeAviary);
    }

    public Carnivorous() {
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        food.addSatiety(this);
        System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                ". Satiety is " + this.getSatiety());
    }
}
