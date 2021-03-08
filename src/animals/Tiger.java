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
        return "Рррррррр";
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
        } else if (food instanceof MeatForTiger) {
            super.eat(food);
        } else {
            System.out.println("Тигр не ест " + food.getClass().getSimpleName());
        }
    }
}
