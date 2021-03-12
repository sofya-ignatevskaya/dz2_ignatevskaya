package animals;

import MyException.WrongFoodException;
import animals.interfaces.Run;
import animals.interfaces.Voice;
import food.Food;
import food.Grass;
import food.MeatForFox;


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

}
