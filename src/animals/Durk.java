package animals;

import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.Wheat;

public class Durk extends Herbivore implements Run, Swim, Fly, Voice {
    public Durk(String name, int satiety) {
        super(name, satiety);
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
    void eat(Food food) {
        if (food instanceof Wheat) {
            super.eat(food);
        }else{
            System.out.println("Утка это не ест");
        }
    }
}
