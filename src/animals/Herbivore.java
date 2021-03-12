package animals;

import MyException.WrongFoodException;
import food.Food;
import food.Grass;
import food.Meat;
import food.Wheat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public Herbivore(String name, SizeAviary sizeAviary) {
        super(name, sizeAviary);
    }

    public Herbivore() {
    }
    public String getSuperClassName(){
        return "Herbivore";
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            food.addSatiety(this);
            System.out.println(this.getName() + " eat " + food.getClass().getSimpleName() +
                    ". Satiety is " + this.getSatiety());
        } else {
            throw new WrongFoodException("Растительноядные не едят мясо: "
                    + food.getClass().getSimpleName());
        }
    }
}
