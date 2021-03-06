package animals;

import animals.interfaces.Swim;
import food.Food;
import food.MeatForFish;
import food.Wheat;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void swim() {
            System.out.println(this.getName() + " is swimming");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof MeatForFish) {
            super.eat(food);
        }else{
            System.out.println("Хищная рыба это не ест");
        }
    }
}
