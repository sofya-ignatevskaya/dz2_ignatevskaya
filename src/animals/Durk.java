package animals;

import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.Meat;
import food.Wheat;

public class Durk extends Herbivore implements Run, Swim, Fly, Voice {
    public Durk(String name, int satiety) {
        super(name, satiety);
    }

    public Durk() {
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying");
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
        return "Кря-Кря";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Растительноядные не едят мясо");
        } else if (food instanceof Wheat) {
            super.eat(food);
        } else {
            System.out.println("Утка это не ест");
        }
    }
}
