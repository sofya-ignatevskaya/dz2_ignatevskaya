package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;
import food.Food;
import food.Leaves;
import food.Wheat;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public String voice() {
        return "Ааааааа";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Leaves) {
            super.eat(food);
        }else{
            System.out.println("Жираф это не ест");
        }
    }
}
