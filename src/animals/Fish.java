package animals;

import animals.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void swim() {
            System.out.println(this.getName() + " is swimming");
    }
}
