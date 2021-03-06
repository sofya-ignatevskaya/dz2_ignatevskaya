package animals;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.MeatForTiger;
import food.Wheat;

public class Tiger extends Carnivorous implements Run, Swim, Voice {
    public Tiger(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public String voice() {
        return "Рррррррр";
    }
    @Override
    void eat(Food food) {
        if (food instanceof MeatForTiger) {
            super.eat(food);
        }else{
            System.out.println("Тигр это не ест");
        }
    }
}
