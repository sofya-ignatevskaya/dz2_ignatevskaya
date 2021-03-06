package animals;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.MeatForFox;
import food.Wheat;

public class Fox extends Carnivorous implements Run, Swim, Voice {
    public Fox(String name, int satiety) {
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
        return "Вр-Вр-Вр";
    }

    @Override
    void eat(Food food) {
        if (food instanceof MeatForFox) {
            super.eat(food);
        }else{
            System.out.println("Лиса это не ест");
        }
    }
}
