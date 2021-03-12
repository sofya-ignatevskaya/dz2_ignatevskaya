package animals;

import MyException.WrongFoodException;
import animals.interfaces.Run;
import animals.interfaces.Voice;
import food.Food;
import food.Leaves;
import food.Meat;
import food.Wheat;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name, int satiety) {
        super(name, satiety);
    }

    public Giraffe() {
    }

    public Giraffe(String name, SizeAviary sizeAviary) {
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
        return "Ааааааа";
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
