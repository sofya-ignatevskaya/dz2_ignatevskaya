package animals;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.Grass;
import food.MeatForTiger;
import food.Wheat;

public class Tiger extends Carnivorous implements Run, Voice {

    public Tiger(String name, int satiety) {
        super(name, satiety);
    }

    public Tiger() {
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public String voice() {
        return "Рррррррр";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Хищники не едят растения");
        } else if (food instanceof MeatForTiger) {
            super.eat(food);
        } else {
            System.out.println("Тигр это не ест");
        }
    }
}
