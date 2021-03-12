package animals;

import MyException.WrongFoodException;
import food.Food;
import food.Meat;

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
        if (food instanceof Meat) {
            food.addSatiety(this);
            System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                    ". Satiety is " + this.getSatiety());
        } else {
            throw new WrongFoodException("Хищники не едят растения: "
                    + food.getClass().getSimpleName());
        }
    }
}

