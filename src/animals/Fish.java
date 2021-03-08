package animals;

import MyException.WrongFoodException;
import animals.interfaces.Swim;
import food.Food;
import food.Grass;
import food.MeatForFish;
import food.Wheat;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int satiety) {
        super(name, satiety);
    }

    public Fish() {
    }

    public Fish(String name, SizeAviary sizeAviary) {
        super(name, sizeAviary);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public void dive() {
        System.out.println(this.getName() + " is diving");
    }

    @Override
    public void emerge() {
        System.out.println(this.getName() + " is emerging from the water");
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Хищники не едят растения: " + food.getClass().getSimpleName());
        } else if (food instanceof MeatForFish) {
            super.eat(food);
        } else {
            throw new WrongFoodException("Хищная рыба не ест " + food.getClass().getSimpleName());
        }
    }
}
