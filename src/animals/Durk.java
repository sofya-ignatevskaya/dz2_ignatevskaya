package animals;

import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.Meat;
import food.Wheat;

public class Durk extends Herbivore implements Swim, Fly, Voice {
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
    public void takeOff() {
        System.out.println(this.getName() + " took off");
    }

    @Override
    public void landing() {
        System.out.println(this.getName() + " is landing");
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
    public String voice() {
        return "Кря-Кря";
    }

    @Override
    public void shout() {
        System.out.println(this.getName() + " is shouting");
    }

    @Override
    public void silent() {
        System.out.println(this.getName() + " is silent");
    }
}
