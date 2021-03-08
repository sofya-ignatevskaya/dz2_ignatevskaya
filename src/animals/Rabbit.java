package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;
import food.Carrot;
import food.Food;
import food.Meat;
import food.Wheat;

public class Rabbit extends Herbivore implements Run, Voice {
    public Rabbit(String name, int satiety) {
        super(name, satiety);
    }

    public Rabbit() {
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void go() {
        System.out.println(this.getName() + " is going");
    }

    @Override
    public void crawl() {
        System.out.println(this.getName() + " is crawling");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + " is jumping");
    }

    @Override
    public String voice() {
        return "Фр-фр-фр";
    }

    @Override
    public void shout() {
        System.out.println(this.getName() + " is shouting");
    }

    @Override
    public void silent() {
        System.out.println(this.getName() + " is silent");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Растительноядные не едят мясо: " + food.getClass().getSimpleName());
        } else if (food instanceof Carrot) {
            super.eat(food);
        } else {
            System.out.println("Кролик не ест " + food.getClass().getSimpleName());
        }
    }
}
