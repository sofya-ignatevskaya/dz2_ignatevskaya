package animals;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.Food;
import food.Grass;
import food.MeatForFox;
import food.Wheat;

public class Fox extends Carnivorous implements Run, Voice {
    public Fox(String name, int satiety) {
        super(name, satiety);
    }

    public Fox() {
    }

    public Fox(String name, SizeAviary sizeAviary) {
        super(name, sizeAviary);
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
        return "Вр-Вр-Вр";
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
        if (food instanceof Grass) {
            System.out.println("Хищники не едят растения: " + food.getClass().getSimpleName());
        } else if (food instanceof MeatForFox) {
            super.eat(food);
        } else {
            System.out.println("Лиса не ест " + food.getClass().getSimpleName());
        }

    }
}
