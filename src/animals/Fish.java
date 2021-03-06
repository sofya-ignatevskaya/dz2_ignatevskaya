package animals;

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

    @Override
    public void swim() {
            System.out.println(this.getName() + " is swimming");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Хищники не едят растения");
        }else if (food instanceof MeatForFish) {
            super.eat(food);
        }else{
            System.out.println("Хищная рыба это не ест");
        }
    }
}
